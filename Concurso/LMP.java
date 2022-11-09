import java.io.BufferedInputStream;
import java.util.Scanner;

public class LMP {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    return;
                }
                int media = 0;
                for (int i = 0; i < n; i++) {
                    media += sc.nextInt();
                }

                int nota = sc.nextInt();

                int notaFinal = nota * (n + 1) - media;

                if (notaFinal > 10 || notaFinal < 0) {
                    System.out.println("IMPOSIBLE");
                } else {
                    System.out.println(notaFinal);
                }
            }

        }
    }
}
