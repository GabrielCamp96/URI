import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '1') count++;
        }
        if(count%2==0) s+='0';
        else s+='1';
        System.out.println(s);
    }
 
}