import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            double count=0;
            int N = scan.nextInt();
            for(int i=0;i<N;i++)
                if(scan.nextInt()==1)
                    count++;
            if(count/N >= 2.0/3.0)
                System.out.println("impeachment");
            else
                System.out.println("acusacao arquivada");
        }
 
    }
 
}