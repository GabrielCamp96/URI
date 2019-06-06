import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n,m,troco;
        n = scan.nextInt();
        m = scan.nextInt();
        while(!(n==m && n==0)){
            int i=0;
            boolean p=false;
            troco = m-n;
            if(troco>=100){ 
                troco=troco-100;
                i++;
            }
            if(troco>=50) {
                troco=troco-50;
                i++;
            }
            if(troco>=20) {
                troco=troco-20;
                i++;
            }
            if(troco>=10) {
                troco=troco-10;
                i++;
            }
            if(troco>=5) {
                troco=troco-5;
                i++;
            }
            if(troco>=2) {
                troco=troco-2;
                i++;
            }
            if(troco==0 && i==2) p=true;
            if(p) System.out.println("possible");
            else System.out.println("impossible");
            n = scan.nextInt();
            m = scan.nextInt();
        }
    }
 
}