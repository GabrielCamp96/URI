import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int queda = 0, v=0;
        for(int i=0;i<n;i++){
            int temp = scan.nextInt();
            if(v<=temp) v=temp;
            else { 
                queda=i+1;
                break;
            }
        }
        System.out.println(queda);
    }
 
}