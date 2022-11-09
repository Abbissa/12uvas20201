import java.io.BufferedInputStream;
import java.util.Scanner;

public class DC {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    return;
                }
                boolean[] calcetines = new boolean[100];
                int desparejados=0;
                int max=0;
                for (int i = 0; i < n; i++) {
                    int aux=sc.nextInt();

                    if(calcetines[aux-1]){
                        max=Math.max(max, desparejados);
                        calcetines[aux-1]=false;
                        desparejados--;
                    }else{
                        calcetines[aux-1]=true;
                        desparejados++;
                        max=Math.max(max, desparejados);
                    }

                }
                System.out.println(max);
            }

        }
    }
}
