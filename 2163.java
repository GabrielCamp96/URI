import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x=0,y=0;
        int[][] terreno = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) terreno[i][j] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(terreno[i][j] == 42 && i>0 && j>0 && i<n-1 && j<m-1){
                    if(
                    terreno[i][j-1] == 7 &&
                    terreno[i-1][j-1] == 7 &&
                    terreno[i-1][j] == 7 &&
                    terreno[i-1][j+1] == 7 &&
                    terreno[i][j+1] == 7 &&
                    terreno[i+1][j+1] == 7 &&
                    terreno[i+1][j] == 7 &&
                    terreno[i+1][j-1] == 7){
                        x=i+1;
                        y=j+1;
                    }
                }
            }
        }
        System.out.printf("%d %d\n", x,y);
 
    }
 
}