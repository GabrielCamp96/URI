import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    scan.nextLine();
		while(n > 0) {
		    char[] input = scan.nextLine().toCharArray();
		    char[] output = new char[input.length];
		    for(int i = 0; i < (input.length) / 2; i++) {
		        output[i] = input[((input.length - 1) / 2) - i];
		    }
		    int i = 0;
		    for(int j = (input.length / 2); j < input.length; j++) {
		        output[j] = input[input.length - 1 - i];
		        i++;
		    }
		    
		    System.out.println(output);
		    n--;
		}
	}
}