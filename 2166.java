import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        double r=0;
        while(i<n){
            r+=2;
            r=1/r;
            i++;
        }
        r+=1;
        System.out.printf("%.10f\n",r);
 
    }
 
}