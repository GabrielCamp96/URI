import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        double fib = Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n);
        fib=fib/Math.sqrt(5);
        System.out.printf("%.1f\n", fib);
        
    }
 
}