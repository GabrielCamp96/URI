import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int start, n;
        Scanner scan = new Scanner(System.in);
        start=scan.nextInt();
        n = scan.nextInt();
        for(int i=0; i<n;i++)
            if(scan.next().equals("fechou")) start++;
            else start--;
        System.out.println(start);
    }
 
}