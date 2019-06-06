import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int N = scan.nextInt();
            int count = 0;
            while(N/2>=1){
                count++;
                N/=2;
            }
            System.out.println(count);
        }
    }
}