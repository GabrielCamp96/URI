import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
		    char[] input = scan.nextLine().toCharArray();
            for(int i = 0; i < input.length; i++) {
                if(Character.isLetter(input[i])) {
                    int number = (int) input[i];
                    char letter;
                    char cast;
                    if(Character.isLowerCase(input[i])) cast = 'a';
                    else cast = 'A';
                    if(number + 13 <= (int)cast + 25) letter = (char)(number + 13);
                    else letter = (char)(number + 13 - 26);
                    input[i] = letter;
                } else continue;
            }
            System.out.println(input);
		}
	}
}
