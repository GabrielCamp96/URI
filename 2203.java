import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            double xf=scan.nextDouble();
            double yf=scan.nextDouble();
            double xi=scan.nextDouble();
            double yi=scan.nextDouble();
            double vi=scan.nextDouble();
            double r1=scan.nextDouble();
            double r2=scan.nextDouble();
            double[] mapa = new double[2];
            mapa[0] = xf-xi;
            mapa[1] = yf-yi;
            double d = Math.sqrt((Math.pow(mapa[0],2)+Math.pow(mapa[1],2)));
            d+=1.5*vi;
            if(d<=r1+r2) System.out.println("Y");
            else System.out.println("N");
        }
    }
 
}