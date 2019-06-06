import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(scan.hasNext()){
            String sub,full;
            int aux=0,count=0;
            i++;
            sub = scan.nextLine();
            full = scan.nextLine();
            while(full.indexOf(sub,aux)!=-1){
                aux = (full.indexOf(sub,aux)+sub.length());
                count++;
            }
            System.out.println("Caso #"+i+":");
            aux -= sub.length()-1;
            if(count==0) System.out.println("Nao existe subsequencia\n");
            else {
                System.out.println("Qtd.Subsequencias: "+count);
                System.out.println("Pos: "+aux+"\n");
            }
        }
 
    }
 
}