import java.util.Scanner;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
		    HashMap<Character,Character> cifra = new HashMap();
		    int C = scan.nextInt();
		    int N = scan.nextInt();
		    String C1 = scan.next();
		    while(C1.length()<C){ 
		        C1 = C1.concat(" ");    
		        C1 = C1.concat(scan.next());
	        }
		    String C2 = scan.next();
		    while(C2.length()<C){ 
		        C2 = C2.concat(" ");
		        C2 = C2.concat(scan.next());
		    }
		    for(int i=0;i<C;i++) {
		        cifra.put(C1.charAt(i),C2.charAt(i)); 
		        cifra.put(C2.charAt(i),C1.charAt(i));
		    }
		    scan.nextLine();
		    for(int j=0;j<N;j++){ 
		        String s = scan.nextLine();
		        String aux = "";
		        char[] phraseArray = s.toCharArray();
		        for(int k=0;k<phraseArray.length;k++){
		                char buff = Character.toUpperCase(phraseArray[k]);
		                if(cifra.containsKey(buff)){
		                    if(Character.isUpperCase(phraseArray[k]))
		                        phraseArray[k] = cifra.get(buff);
		                    else
		                        phraseArray[k] = Character.toLowerCase(cifra.get(buff));
		                }
		        }
		        for(int l=0;l<phraseArray.length;l++)
		                aux = aux.concat(Character.toString(phraseArray[l]));
		        System.out.println(aux);
		    }
	        System.out.println();
		}
	}
}