import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
		
    		char[] input = scan.nextLine().toCharArray();
    		
    		boolean maiuscula = true;
    		
    		for(int i = 0; i < input.length; i++) {
    		    if(Character.isWhitespace(input[i])) continue;
    		    else {
    		        if(maiuscula) {
    		            input[i] = Character.toUpperCase(input[i]);
    		        } else {
    		            input[i] = Character.toLowerCase(input[i]);
    		        }
    		        
    		        maiuscula = !maiuscula;
    		    }
    		}
    		
    		System.out.println(input);
		}
	}
}
