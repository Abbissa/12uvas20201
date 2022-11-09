import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TDE {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                int m = sc.nextInt();
                int[] lados = new int[m];

                for (int j = 0; j < m; j++) {
                    lados[j] = sc.nextInt();
                }
                Arrays.sort(lados);
                boolean fin = false;
                int res = 0;

                if (lados.length >= 3) {
                    int max = lados[lados.length - 1];
                    int medio = lados[lados.length - 2];
                    int corto = lados[lados.length - 3];

                    if (max < corto + medio&&medio<max+corto&&corto<medio+max) {
                        fin = true;
                        res = corto + medio + max;
                    }

                    for (int j = lados.length - 4; j >= 0 && !fin; j--) {

                        max = medio;
                        medio = corto;
                        corto = lados[j];
                        if (max < corto + medio&&medio<max+corto&&corto<medio+max) {
                            res = corto + medio + max;
                            fin = true;
                        }

                    }
                }
                if (!fin) {
                    System.out.println("NO HAY NINGUNO");
                } else {
                    System.err.println(res);
                }
            }
        }

    }

}
