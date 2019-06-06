import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException{
	    double pi=3.14;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextDouble()){
		    double h=0,a=0,v,d;
		    v=scan.nextDouble();
		    d=scan.nextDouble();
		    a=pi*Math.pow(d,2)/4;
		    h=v/a;
		    System.out.printf("ALTURA = %.2f\n", h);
		    System.out.printf("AREA = %.2f\n", a);
		}
	}
}
