import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b,a1,d1,l1,a2,d2,l2,v1,v2;
        for(int i=0;i<n;i++){
            b=scan.nextInt();
            a1=scan.nextInt();
            d1=scan.nextInt();
            l1=scan.nextInt();
            a2=scan.nextInt();
            d2=scan.nextInt();
            l2=scan.nextInt();
            v1=(a1+d1)/2;
            v2=(a2+d2)/2;
            if(l1%2==0) v1+=b;
            if(l2%2==0) v2+=b;
            if(v1>v2) System.out.println("Dabriel");
            else{
                if(v1<v2) System.out.println("Guarte");
                else System.out.println("Empate");
            }
        }
    }
 
}