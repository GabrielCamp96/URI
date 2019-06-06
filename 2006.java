import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int cha,resp,count=0;
        Scanner scan = new Scanner(System.in);
        cha = scan.nextInt();
        for(int i=0;i<5;i++){
            resp=scan.nextInt();
            if(resp==cha)count++;
        }
        System.out.println(count);
           
    }
 
}