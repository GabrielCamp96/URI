import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int dia;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,31);
        map.put(2,29);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        while(scan.hasNext()){
            int ano=360,mes;
            mes = scan.nextInt();
            dia = scan.nextInt();
            for(int i=1;i<=mes-1;i++) dia+=map.get(i);
            ano -= dia;
            if(ano==0) System.out.println("E natal!");
            else    if(ano==1) System.out.println("E vespera de natal!");
                    else    if(ano<0) System.out.println("Ja passou!");
                            else    System.out.println("Faltam " + ano + " dias para o natal!");
        }
    }
 
}