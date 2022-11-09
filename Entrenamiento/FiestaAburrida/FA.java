import java.io.BufferedInputStream;
import java.util.Scanner;

public class FA {
    public static void main (String[] args){
        print();
        
    }
    static void print() {
        
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                sc.next();
                System.out.println("Hola, "+sc.next()+".");
                
                
            }
        }
    }
    
}
