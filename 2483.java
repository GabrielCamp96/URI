import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String a="";
		while(N-- > 0)
		    a = a.concat("a");
		String s = "Feliz nat" + a + "l!";
		System.out.println(s);
	}
}

