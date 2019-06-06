import java.io.IOException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws IOException{
		String[] tempo = new String[2];
		int atraso=0,hora,min;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
		    tempo = scan.nextLine().split(":");
		    hora=Integer.parseInt(tempo[0]);
		    min=Integer.parseInt(tempo[1]);
		    if(hora<7) System.out.println("Atraso maximo: "+atraso);
		    else{
		        atraso = min;
		        if(hora>7) atraso+=60*(hora-7);
		        System.out.println("Atraso maximo: "+atraso);
		    }
		}
	}
}
