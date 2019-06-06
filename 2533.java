import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		    int N = scan.nextInt();
		    double[] notas = new double[N];
		    double[] horas = new double[N];
		    double num = 0;
		    double den = 0;
		    for(int i=0;i<N;i++){
		        notas[i] = scan.nextInt();
		        horas[i] = scan.nextInt();
		    }
		    for(int j=0;j<N;j++){
		        num += notas[j]*horas[j];
		        den += horas[j];
		    }
		    double IRA = num/(den*100);
		    System.out.printf("%.4f\n", IRA);
		}
	}
}
