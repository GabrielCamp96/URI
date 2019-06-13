import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    while(scan.hasNext()) {
	        String in1 = scan.nextLine();
	        String in2 = scan.nextLine();
	        int max = 0;
	        String maior, menor;
	        if (in1.length() >= in2.length()) {
	            maior = in1;
	            menor = in2;
	        } else {
	            maior = in2;
	            menor = in1;
	        }
	        
	        if(maior.contains(menor)) max = menor.length();
	        else {
    	        for (int i = 0; i < menor.length()-1; i++) {
    	            for(int j = i;j <= menor.length(); j++) {
        	            if(maior.contains(menor.substring(i,j)) && 
        	                menor.substring(i,j).length() > max) {
        	                max = menor.substring(i,j).length();
        	            } else {
        	                continue;
        	            }
    	                
    	            }
    	        }
    	        if(maior.contains(menor.substring(menor.length()-1)) && max < 1){ 
    	            max = 1;
    	        }
	        }
	        
	        System.out.println(max);
        }
	}
}