import java.io.BufferedInputStream;
import java.util.Scanner;

public class EQV {
    
    public static void main (String[] args){
        print();
        
    }
    static void print() {
        
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                
                System.out.println(sc.nextInt()/100);                
                
            }
        }
    }
}
