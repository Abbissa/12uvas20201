import java.io.BufferedInputStream;
import java.util.Scanner;

public class LOP {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int aux = sc.nextInt();
                if (aux % 2 == 0) {
                    System.out.println(aux + 1);

                } else {
                    System.out.println(aux - 1);
                }

            }
        }
    }

}
