import java.io.BufferedInputStream;
import java.util.Scanner;

public class EJDLP {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int[] JOKER = new int[10];
                int[] boleto = new int[10];
                String J = sc.next();
                for (char c : J.toCharArray()) {
                    JOKER[Integer.parseInt(c + "")]++;
                }
                String b = sc.next();
                for (char c : b.toCharArray()) {
                    boleto[Integer.parseInt(c + "")]++;
                }
                boolean pierde = false;
                for (int j = 0; j < boleto.length && !pierde; j++) {
                    if (boleto[j] != JOKER[j]) {
                        pierde = true;
                    }
                }

                if (pierde) {
                    System.out.println("PIERDE");
                } else {
                    System.out.println("GANA");
                }
            }

        }

    }
}
