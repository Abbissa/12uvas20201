import java.io.BufferedInputStream;
import java.util.Scanner;

public class EU {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (true) {

                long sabor;
                long piel;
                long mejorSabor = Long.MIN_VALUE;
                long mejorPiel = Long.MAX_VALUE;
                boolean valida = false;

                sabor = sc.nextLong();
                piel = sc.nextLong();

                while (sabor != 0 || piel != 0) {

                    if (mejorSabor <= sabor && mejorPiel >= piel) {
                        valida = true;

                    }
                    if (sabor > mejorSabor) {
                        mejorSabor = sabor;
                        if (mejorPiel < piel)
                            valida = false;
                    }

                    if (piel < mejorPiel) {
                        mejorPiel = piel;
                        if (mejorSabor > sabor)
                            valida = false;
                    }

                    sabor = sc.nextLong();
                    piel = sc.nextLong();

                }
                if (valida)
                    System.out.println((long)mejorSabor + " " + (long)mejorPiel);
                else
                    System.out.println("NO HAY MEJOR");

            }

        } catch (Exception e) {
            return;
        }

    }
}
