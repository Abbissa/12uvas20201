import java.io.BufferedInputStream;
import java.util.Scanner;

public class PEJ {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String aux = sc.next();
                String[] fecha = aux.split("/");
                int año = Integer.parseInt(fecha[2]);

                if (fecha[0].equals("29") && fecha[1].equals("02") && año % 4 == 0) {
                    año = año + 4;
                    System.out.println("29/02/" + String.format("%04d", año));

                } else {
                    int mes = Integer.parseInt(fecha[1]);
                    if (mes > 2||año % 4 != 0)
                        año += 4 - año % 4;
                    System.out.println("29/02/" + String.format("%04d", año));
                }
            }

        }
    }
}
