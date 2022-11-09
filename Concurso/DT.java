import java.io.BufferedInputStream;
import java.util.Scanner;

public class DT {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {

            while (sc.hasNext()) {

                int n = sc.nextInt();
                int m = sc.nextInt();
                int time = sc.nextInt();

                int[] r1 = new int[n+1];
                int[] r2 = new int[m+1];

                for (int i = r1.length - 1; i > 0; i--) {
                    r1[i] = sc.nextInt();

                }
                for (int i = r2.length - 1; i > 0; i--) {
                    r2[i] = sc.nextInt();
                }
                
                int max=0;
                int iTime = 0;

                int[] jTimes = new int[m+1];
                for (int i = 1; i < jTimes.length; i++) {
                    jTimes[i]=r2[i]+jTimes[i-1];
                    if(jTimes[i]<=time)
                        max=i;
                }
                for (int i = 1; i < r1.length; i++) {
                        iTime+=r1[i];
                        if(iTime>time)
                            break;
                    for (int j = max-i+1; j < r2.length; j++) {
                        
                        if(jTimes[j]+iTime<=time)
                            max=Math.max(max, i+j);
                        else 
                            break;
                    }
                }
                System.out.println(max);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
