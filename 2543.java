import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int N = scan.nextInt();
            int id = scan.nextInt();
            int count = 0;
            for(int i=0;i<N;i++){
                int player = scan.nextInt();
                int jogo = scan.nextInt();
                if(player == id)
                    if(jogo == 0)
                        count++;
            }
            System.out.println(count);
        }
    }
}