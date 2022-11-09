import java.io.BufferedInputStream;
import java.util.Scanner;

public class VAV {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    return;
                }
                int res = 0;
                int[] ruidos = new int[n];
                int ruido = 0;
                for (int i = 0; i < n; i++) {

                    ruidos[ruidos.length - i-1] = sc.nextInt();
                }

                for (int i = 0; i < ruidos.length; i++) {
                    if (ruido > 0) {
                        ruido--;
                        res++;
                    }

                    ruido=Math.max(ruido,ruidos[i]);

                }
                System.out.println(res);
            }

        }
    }
}
