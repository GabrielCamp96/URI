import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        while(i<n){
            int h,m,p;
            String s="";
            h=scan.nextInt();
            m=scan.nextInt();
            p=scan.nextInt();
            if(p==0) s = s.format("%02d:%02d - A porta fechou!",h,m);
            else s = s.format("%02d:%02d - A porta abriu!",h,m);
            System.out.println(s);
            i++;
        }
 
    }
 
}