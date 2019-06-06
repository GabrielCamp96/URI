import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		    int N = scan.nextInt();
		    int M = scan.nextInt();
		    int[][] mapa = new int[N][M];
		    for(int i=0;i<N;i++)
		        for(int j=0;j<M;j++)
		            mapa[i][j] = scan.nextInt();
		    int[][] tab = new int[N][M];
		    if(N==1){
		        int count=0;
		        for(int i=0;i<M;i++){
		            if(mapa[0][i]==1) tab[0][i] = 9;
		            else{
		                if(i==0){
		                    if(mapa[0][i+1]==1) count++;
		                    else{
		                        if(i==M-1){
		                            if(mapa[0][i-1]==1) count++;
		                        }
		                        else{
		                            if(mapa[0][i+1]==1) count++;
		                            if(mapa[0][i-1]==1) count++;
		                        }
		                    }
		                }
		                tab[0][i] = count;
		            }
		            
		        }
		        for(int m=0;m<M;m++){
		            System.out.printf("%d", tab[0][m]);
		            if(m==M-1) System.out.println();
		        }
		    }
		    else{
		        if(M==1){
    		        int count=0;
    		        for(int i=0;i<N;i++){
    		            if(mapa[i][0]==1) tab[i][0] = 9;
    		            else{
    		                if(i==0){
    		                    if(mapa[i+1][0]==1) count++;
    		                    else{
    		                        if(i==M-1){
    		                            if(mapa[i-1][0]==1) count++;
    		                        }
    		                        else{
    		                            if(mapa[i+1][0]==1) count++;
    		                            if(mapa[i-1][0]==1) count++;
    		                        }
    		                    }
    		                }
		                    tab[i][0] = count;
    		            }
    		            
    		        }
    		        
    		        for(int m=0;m<N;m++){
    		            System.out.printf("%d", tab[m][0]);
		                if(m==M-1) System.out.println();
    		        }
		        }
		        else{
        		    for(int k=0;k<N;k++){
        		       for(int l=0;l<M;l++){
        		           int count=0;
        		           if(mapa[k][l]==1) tab[k][l] = 9;
        		           else{
            		           if(k==0){
            		               if(l==0){
            		                   if(mapa[k][l+1]==1) count++;
            		                   if(mapa[k+1][l]==1) count++;
            		               }
            		               else{
            		                   if(l==M-1){
            		                      if(mapa[k][l-1]==1) count++;
            		                      if(mapa[k+1][l]==1) count++;
            		                   }
            		                   else{
            		                      if(mapa[k][l-1]==1) count++;
            		                      if(mapa[k][l+1]==1) count++;
            		                      if(mapa[k+1][l]==1) count++;
            		                   }
            		               }
            		           }
            		           else{
            		               if(k==N-1){
            		                   if(l==0){
            		                      if(mapa[k][l+1]==1) count++;
            		                      if(mapa[k-1][l]==1) count++;
            		                   }
            		                   else{
            		                       if(l==M-1){
            		                           if(mapa[k][l-1]==1) count++;
            		                           if(mapa[k-1][l]==1) count++;
            		                       }
            		                       else{
            		                           if(mapa[k][l-1]==1) count++;
            		                           if(mapa[k][l+1]==1) count++;
            		                           if(mapa[k-1][l]==1) count++;
            		                       }
            		                   }
            		               }
            		               else{
            		                   if(l==0){
            		                       if(mapa[k][l+1]==1) count++;
            		                       if(mapa[k+1][l]==1) count++;
            		                       if(mapa[k-1][l]==1) count++;
            		                   }
            		                   else{
            		                       if(l==M-1){
            		                           if(mapa[k][l-1]==1) count++;
            		                           if(mapa[k+1][l]==1) count++;
            		                           if(mapa[k-1][l]==1) count++;
            		                       }
            		                       else{
            		                           if(mapa[k][l-1]==1) count++;
            		                           if(mapa[k+1][l]==1) count++;
            		                           if(mapa[k-1][l]==1) count++;
            		                           if(mapa[k][l+1]==1) count++;
            		                       }
            		                   }
            		               }
            		           }
        		               tab[k][l] = count;
            		       }
        		           
        		       }
        		        
        		    }
        		    
        		    for(int m=0;m<N;m++){
        		        for(int n=0;n<M;n++){
        		            System.out.printf("%d",tab[m][n]);
        		            if(n==M-1) System.out.println();
        		        }
        		    }
		        }
		    }
		}
	}
}
