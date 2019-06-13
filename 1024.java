import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		while (n > 0) {
		    String line = scan.nextLine();
		    char part[] = line.toCharArray();
		    
		    // Passo 1
		    for(int i = 0; i < part.length; i++) {
		        if(Character.isLetter(part[i])) {
		            int number = (int)part[i];
		            part[i] = (char)(number + 3);
		        }
		    }

            // Passo 2		    
		    for(int i = 0; i < part.length / 2; i++) {
		        char aux = part[i];
		        part[i] = part[part.length - i - 1];
		        part[part.length - i - 1] = aux;
		    }
		    
		    // Passo 3
		    for(int i = part.length - 1; i > part.length / 2 - 1; i--) {
		        int number = (int)part[i];
		        part[i] = (char)(number - 1);
		    }
		    
		    System.out.println(new String(part));
		    n--;
		}
	}
}