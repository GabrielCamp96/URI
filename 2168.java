import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] mapa = new int[n+1][n+1];
        int count;
        for(int i=0;i<=n;i++) 
            for(int j=0;j<=n;j++) mapa[i][j] = scan.nextInt();
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){
                count=0;
                if(mapa[i][j]==1) count++;
                if(mapa[i][j+1]==1) count++;
                if(mapa[i+1][j]==1) count++;
                if(mapa[i+1][j+1]==1) count++;
                if(count>=2) System.out.printf("S");
                else System.out.printf("U");
                
                
            }
            System.out.printf("\n");
        }
 
    }
 
}