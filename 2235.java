import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean volta = false;
        if(a==b || b==c || c==a) volta = true;
        else{
            if(a+b==c || a+c==b || b+c==a) volta = true;
        }
        if(volta) System.out.println("S");
        else System.out.println("N");
 
    }
 
}