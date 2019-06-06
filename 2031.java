import java.io.IOException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws IOException{
	    Scanner scan = new Scanner(System.in);
	    int n;
	    String s1,s2;
	    n=scan.nextInt();
		for(int i=0;i<n;i++){
		    s1=scan.next();
		    s2=scan.next();
		    if(s1.equals("ataque")){
		        if(s2.equals("pedra") || s2.equals("papel") ) System.out.println("Jogador 1 venceu");
		        else System.out.println("Aniquilacao mutua");
		    }else{
    		    if(s1.equals("pedra")){
    		       if(s2.equals("papel")) System.out.println("Jogador 1 venceu");
    		       else if(s2.equals("pedra")) System.out.println("Sem ganhador");
    		            else System.out.println("Jogador 2 venceu");
    		    }else{
    		        if(s2.equals("papel")) System.out.println("Ambos venceram");
    		        else System.out.println("Jogador 2 venceu");
    		    }
    		        
		    }
		}
	}
}
