import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double s=0,b=0,a=0,totals=0,totalb=0,totala=0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            String nome = scan.next();
            totals += scan.nextInt();
            totalb += scan.nextInt();
            totala += scan.nextInt();
            s += scan.nextInt();
            b += scan.nextInt();
            a += scan.nextInt();
        }
        double ps = s*100/totals;
        double pb = b*100/totalb;
        double pa = a*100/totala;
        System.out.printf("Pontos de Saque: %.2f %%.\n", ps);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", pb);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", pa);
 
    }
 
}