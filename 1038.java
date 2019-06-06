import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double[] preco; 
        preco = new double[5];
        preco[0] = 4;
        preco[1] = 4.5;
        preco[2] = 5;
        preco[3] = 2;
        preco[4] = 1.5;
        
        int cod,quant;
        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt() - 1;
        quant = sc.nextInt();
        System.out.printf("Total: R$ %.2f\n", (preco[cod]*quant));
    }
 
}