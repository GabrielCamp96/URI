import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        long a=scan.nextInt();
        long b=scan.nextInt();
        long c=scan.nextInt();
        boolean val=false;
        boolean ret=false;
        String tipo="";
        if(a>Math.abs(b-c) && a<b+c && b>Math.abs(a-c) && b<a+c && c>Math.abs(b-a) && c<b+a){
            val=true;
            if(a==b && b==c) {
                tipo="Equilatero";
            } else {
                if(a!=b && b!=c && a!=c){
                    tipo="Escaleno";
                    if(a>b && a>c){
                        if(((b*b)+(c*c))==(a*a)) ret = true;
                    }
                    else {
                        if(b>c && b>a){
                            if(((c*c)+(a*a))==(b*b)) ret = true;    
                        }
                        else{
                            if(((b*b)+(a*a))==(c*c)) ret = true;
                        }
                    }
                    
                }
                else {
                    tipo="Isoceles";
                }
            }
        }
        if(val && ret) {
            System.out.println("Valido-"+tipo);
            System.out.println("Retangulo: S");
        }
        else {
            if(val) {
                System.out.println("Valido-"+tipo);
            System.out.println("Retangulo: N");
            }
            else {
            System.out.println("Invalido");
            }
        }
 
    }
 
}