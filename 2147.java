import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        while(i<n){
            String s;
            double c;
            s = scan.next();
            c = s.length()*0.01;
            System.out.printf("%.2f\n", c);
            i++;
        }
 
    }
 
}