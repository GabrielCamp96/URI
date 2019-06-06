import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1;i<=N;i++){
            String op = scan.next();
            double R = scan.nextInt();
            double G = scan.nextInt();
            double B = scan.nextInt();
            switch(op){
                case "min":{
                    if(R <= G && R <= B)
                        System.out.printf("Caso #%d: %.0f\n", i,R);
                    else
                        if(G <= R && G <= B)
                            System.out.printf("Caso #%d: %.0f\n", i,G);
                        else
                            System.out.printf("Caso #%d: %.0f\n", i,B);
                    break;
                }
                case "max":{
                    if(R >= G && R >= B)
                        System.out.printf("Caso #%d: %.0f\n", i,R);
                    else
                        if(G >= R && G >= B)
                            System.out.printf("Caso #%d: %.0f\n", i,G);
                        else
                            System.out.printf("Caso #%d: %.0f\n", i,B);
                    break;
                }
                case "mean":{
                    double mean = (R+G+B)/3;
                    System.out.printf("Caso #%d: %.0f\n", i, mean - mean%1);
                    break;
                }
                case "eye":{
                    double eye = 0.3*R + 0.59*G + 0.11*B;
                    System.out.printf("Caso #%d: %.0f\n", i, eye - eye%1);
                    break;
                }
            }
        }
 
    }
 
}