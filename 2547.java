import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int count = 0;
            int N = scan.nextInt();
            int Amin = scan.nextInt();
            int Amax = scan.nextInt();
            while(N-- > 0){
                int A = scan.nextInt();
                if(A>=Amin && A<=Amax)
                    count++;
            }
            System.out.println(count);
        }
    }
}