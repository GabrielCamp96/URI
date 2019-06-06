import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] m = new int[n];
        for(int i=0;i<n;i++) m[i] = scan.nextInt();
        boolean padrao=true;
        if(m[0]>m[1]){
            for(int i=1;i<n;i+=2){
                if(n%2==0){
                    if(i==(n-1)){
                        if(m[i]>=m[i-1]) padrao=false;}
                    else
                        if(m[i]>=m[i-1] || m[i]>=m[i+1]) padrao=false;
                }
                else
                    if(m[i]>=m[i-1] || m[i]>=m[i+1]) padrao=false;
            }
        }
        else{
           for(int i=1;i<n;i+=2){
               if(n%2==0){
                    if(i==(n-1)){
                        if(m[i]<=m[i-1]) padrao=false;}
                    else
                        if(m[i]<=m[i-1] || m[i]<=m[i+1]) padrao=false;
                }
                else
                    if(m[i]<=m[i-1] || m[i]<=m[i+1]) padrao=false;
                
            } 
        }
        if(padrao) System.out.println("1");
        else System.out.println("0");
 
    }
 
}