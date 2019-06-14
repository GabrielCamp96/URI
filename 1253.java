import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(;n > 0;n--){
		    char[] input = scan.next().toCharArray();
		    int k = scan.nextInt();
            for(int i = 0; i < input.length; i++) {
                int number = (int)input[i];
                char letter;
                if(number - k >= (int)'A') letter = (char)(number - k);
                else letter = (char)(number - k + 26);
                input[i] = letter;
            }
            System.out.println(input);
		}
	}
}
