import java.io.BufferedInputStream;
import java.util.Calendar;
import java.util.Scanner;

public class PEV {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (true) {

                String aux;

                aux = sc.next();
                int dias = sc.nextInt()*12*28+sc.nextInt()*28+sc.nextInt();

                String[] fecha = aux.split("/");
                

                int dia = Integer.parseInt(fecha[0]);
                int mes = Integer.parseInt(fecha[1]);
                int año = Integer.parseInt(fecha[2]);
                Calendar calendar=Calendar.getInstance();
                if(dia==0&&mes==0&&año==0&&dias==0){
                    return;
                }

                calendar.set(Calendar.YEAR, año);
                calendar.set(Calendar.MONTH, mes-1);
                calendar.set(Calendar.DAY_OF_MONTH, dia);

                calendar.add(Calendar.DAY_OF_YEAR, dias);

                System.out.println(String.format("%02d/%02d/%04d", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR)));
                
            }

        }
    }

}
