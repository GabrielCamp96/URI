import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		while (n-- > 0) {
		    int max = 0;
    		int[] counter = new int[26];
		    char[] data = scan.nextLine().toLowerCase().toCharArray();
		    String res = "";
		    for(int i = 0; i < data.length; i++) {
		        if(Character.isLetter(data[i])){
    		        int number = (int)data[i];
    		        number-=(int)'a';
		            counter[number]+=1;
		            if(counter[number] > max) max = counter[number];
		        }
		    }
		    for(int i = 0;i < 26; i++){
		        if(counter[i] == max){
		            res+=(char)(i+(int)'a');
		        }
		    }
		    System.out.println(res);
		    
		}
	}
}
