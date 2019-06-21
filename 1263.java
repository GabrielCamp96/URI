import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		    int res = 0;
		    char[] data = scan.nextLine().toLowerCase().toCharArray();
		    char firstLetter = data[0];
		    boolean nextWord = false;
		    boolean sameLetter = false;
		    char lastLetter = ' ';
		    for(int i = 1;i < data.length; i++){
		        if(data[i] == ' ') nextWord = true;
		        else{
		            if(nextWord){
		                if(firstLetter == data[i] && firstLetter != lastLetter) {
		                    res++;
		                    lastLetter = firstLetter;
		                } else {
		                    if(firstLetter != data[i]) lastLetter = ' ';
		                }
    		            firstLetter = data[i];
		            }
		            nextWord = false;
		        }
		    }
		    System.out.println(res);
		}
	}
}
