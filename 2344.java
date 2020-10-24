import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String grade = null;
        
        if(score == 0)
            grade = "E";
        else if(score > 0 && score < 36)
            grade = "D";
        else if(score > 35 && score < 61)
            grade = "C";
        else if(score > 60 && score < 86)
            grade = "B";
        else
            grade = "A";
        System.out.println(grade);
    }
 
}