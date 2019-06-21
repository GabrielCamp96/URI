import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		while(n-- > 0){
		    Pattern pattern = Pattern.compile("\\w+");
		    Matcher matcher = pattern.matcher(scan.nextLine());
		    String res = "";
		    while(matcher.find()){
		        res += matcher.group().charAt(0);
		    }
		    System.out.println(res);
		}
	}
}
