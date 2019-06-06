import java.util.Scanner;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> morse = Morse();
		int N = scan.nextInt();
		for(int i=0;i<N;i++){
		    String resposta="";
		    String frase = scan.next();
		    while(frase.lastIndexOf(".......") != -1){
		        frase = frase.replaceAll("\\.{7}","...e...");
		    }
		    String codigo[] = frase.split("\\.{3}");
		    for(int j=0;j<codigo.length;j++){
		        resposta = resposta.concat(morse.get(codigo[j]));
		    }
		    System.out.println(resposta);
		}
	}
	
	public static HashMap Morse(){
	    HashMap<String,String> morse = new HashMap();
		morse.put("=.===","a");
		morse.put("===.=.=.=","b");
		morse.put("===.=.===.=","c");
		morse.put("===.=.=","d");
		morse.put("=","e");
		morse.put("=.=.===.=","f");
		morse.put("===.===.=","g");
		morse.put("=.=.=.=","h");
		morse.put("=.=","i");
		morse.put("=.===.===.===","j");
		morse.put("===.=.===","k");
		morse.put("=.===.=.=","l");
		morse.put("===.===","m");
		morse.put("===.=","n");
		morse.put("===.===.===","o");
		morse.put("=.===.===.=","p");
		morse.put("===.===.=.===","q");
		morse.put("=.===.=","r");
		morse.put("=.=.=","s");
		morse.put("===","t");
		morse.put("=.=.===","u");
		morse.put("=.=.=.===","v");
		morse.put("=.===.===","w");
		morse.put("===.=.=.===","x");
		morse.put("===.=.===.===","y");
		morse.put("===.===.=.=","z");
		morse.put("e"," ");
		return morse;
	}
}

