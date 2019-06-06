import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int n,v,m2=0,m3=0,m4=0,m5=0;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for(int i=0;i<n;i++){
           v=scan.nextInt();
           if(v%2==0) m2++;
           if(v%3==0) m3++;
           if(v%4==0) m4++;
           if(v%5==0) m5++;
        }
        System.out.println(m2+" Multiplo(s) de 2");
        System.out.println(m3+" Multiplo(s) de 3");
        System.out.println(m4+" Multiplo(s) de 4");
        System.out.println(m5+" Multiplo(s) de 5");
    }
 
}