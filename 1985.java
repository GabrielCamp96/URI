import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
		int i,n,q,op;
		double total=0;
		Scanner scan = new Scanner(System.in);
		Map<Integer,Double> item = new HashMap<Integer,Double>();
		item.put(1001,1.50);
		item.put(1002,2.50);
		item.put(1003,3.50);
		item.put(1004,4.50);
		item.put(1005,5.50);
		n = scan.nextInt();
		for(i=0;i<n;i++){
		   op = scan.nextInt();
		   q = scan.nextInt();
		   total+=item.get(op)*q;
		}
		System.out.printf("%.2f\n", total);
	}
 
}