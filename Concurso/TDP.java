import java.io.BufferedInputStream;
import java.util.Scanner;

public class TDP {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            int n = sc.nextInt();
            int rondas = sc.nextInt();

            while (n != 0 || rondas != 0) {
                int res = 0;

                boolean[] participantes = new boolean[n];
                String aux = sc.next();
                for (int i = 0; i < n; i++) {

                    participantes[i] = aux.charAt(i) == '1';
                }

                
                for (int j = 0; j < rondas; j++) {
                    boolean[] temp = new boolean[participantes.length / 2];
                    for (int i = 0; i < participantes.length; i += 2) {

                        if (participantes[i] && participantes[i + 1]) {
                            res++;
                            temp[i / 2] = true;
                        } else if (participantes[i] || participantes[i + 1])
                            temp[i / 2] = true;
                        else
                            temp[i / 2] = false;
                    }
                    participantes = temp;
                }
                System.out.println(res);

                n = sc.nextInt();
                rondas = sc.nextInt();

            }

        }

    }
}
