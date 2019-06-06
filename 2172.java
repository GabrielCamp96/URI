import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n=0;
        double xp=1.0;
        while(!(n==xp && n==0)){
            n=scan.nextInt();
            xp=scan.nextDouble();
            double r = n*xp;
            if(r!=0)System.out.printf("%.0f\n",r);
        }
    }
 
}