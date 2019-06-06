import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> alimentos = Alimentos();
        int N = 1;
        while(N!=0){
            int total = 0;
            N = scan.nextInt();
            if(N==0) break;
            for(int i=0;i<N;i++){
                int quant = scan.nextInt();
                String s = scan.nextLine();
                s = s.substring(1,s.length());
                int mg = alimentos.get(s);
                total += quant*mg;
            }
            if(total>130)
                System.out.println("Menos " + (total-130) + " mg");
            else{
                if(total<110)
                    System.out.println("Mais " + (110-total) + " mg");
                else
                    System.out.println(total + " mg");
            }
        }
    }
    
    public static HashMap Alimentos(){
        HashMap<String,Integer> alimentos = new HashMap();
        alimentos.put("suco de laranja",120);
        alimentos.put("morango fresco",85);
        alimentos.put("mamao",85);
        alimentos.put("goiaba vermelha",70);
        alimentos.put("manga",56);
        alimentos.put("laranja",50);
        alimentos.put("brocolis",34);
        return alimentos;
    }
 
}