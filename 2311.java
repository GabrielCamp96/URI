import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] names = new String[n];
		double[] peso = new double[n];
		double[] total = new double[n];
		for(int i=0;i<n;i++){
		    total[i]=0;
		    double[] notas = new double[7];
		    names[i] = scan.next();
		    peso[i] = scan.nextDouble();
		    double max=0;
		    double min=10;
		    for(int j=0;j<7;j++) {
		        notas[j] = scan.nextDouble();
		        if(max<notas[j]) max = notas[j];
		        if(min>notas[j]) min = notas[j];
		        total[i]+=notas[j];
		    }
		    total[i]=(total[i]-(max+min))*peso[i];
		}
		for(int k=0;k<n;k++){
		    System.out.printf("%s %.2f\n", names[k],total[k]);
		}
	}
}
