import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int N = scan.nextInt();
            ArrayList<Double> recorde = new ArrayList();
            ArrayList<Integer> dias = new ArrayList();
            recorde.add(0.0);
            for(int i=1;i<=N;i++){
                double min = scan.nextInt();
                double dist = scan.nextInt();
                Collections.sort(recorde);
                if(dist/min > recorde.get(recorde.size()-1)){
                    recorde.add(dist/min);
                    dias.add(i);
                }
            }
            for(int j=0;j<dias.size();j++)
                System.out.println(dias.get(j));
        }
        
    }
}