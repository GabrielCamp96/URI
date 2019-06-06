import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            HashMap<Integer,ArrayList> deck1 = new HashMap();
            HashMap<Integer,ArrayList> deck2 = new HashMap();
            long N = scan.nextInt();
            int D1 = scan.nextInt();
            int D2 = scan.nextInt();
            for(int i=0;i<D1;i++){
                ArrayList<Long> carta = new ArrayList(); 
                for(int j=0;j<N;j++){
                    carta.add(scan.nextLong());
                }
                deck1.put(i+1,carta);
            }
            for(int k=0;k<D2;k++){
                ArrayList<Long> carta = new ArrayList(); 
                for(int l=0;l<N;l++){
                    carta.add(scan.nextLong());
                }
                deck2.put(k+1,carta);
            }
            int c1 = scan.nextInt();
            int c2 = scan.nextInt();
            int atrib = scan.nextInt()-1;
            ArrayList carta1 = deck1.get(c1);
            ArrayList carta2 = deck2.get(c2);
            long v1 = (long)carta1.get(atrib);
            long v2 = (long)carta2.get(atrib);
            if(v1>v2)
                System.out.println("Marcos");
            else{
                if(v1==v2)
                    System.out.println("Empate");
                else
                    System.out.println("Leonardo");
            }
        }
    }
}