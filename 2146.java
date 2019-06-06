import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int x = scan.nextInt();
            x-=1;
            System.out.println(x);
        }
 
    }
}