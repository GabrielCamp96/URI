import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int[] poke = new int[2];
	    int[] trainer = new int[2];
		while(scan.hasNextInt()){
		    int N = scan.nextInt();
		    int M = scan.nextInt();
		    int[][] cidade = new int[N][M];
		    for(int i=0;i<N;i++){
		        for(int j=0;j<M;j++){
		            cidade[i][j] = scan.nextInt();
		            if(cidade[i][j] == 1){
		                trainer[0] = i;
		                trainer[1] = j;
		            } else {
		                if(cidade[i][j] == 2){
		                    poke[0] = i;
		                    poke[1] = j;
		                }
		            }
		        }
		    }
		    System.out.println(Math.abs(poke[0]-trainer[0]) + Math.abs(poke[1]-trainer[1]));
		}
	}
}
