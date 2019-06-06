import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        String esq, fam, ali, animal;
        Scanner sc1 = new Scanner(System.in);
        esq=sc1.next();
        fam=sc1.next();
        ali=sc1.next();
        if(esq.equals("vertebrado")){
            animal = vert(fam,ali);
            System.out.printf(animal);
        }
        else{
            animal = invert(fam,ali);
            System.out.printf(animal);
        }
 
    }
    
    public static String vert(String fam, String ali){
        if(fam.equals("ave")){
            if(ali.equals("carnivoro")){
                return "aguia\n";
            }
            else{
                return "pomba\n";
            }
            
        }
        else {
            if(ali.equals("onivoro")){
                return "homem\n";
            }
            else{
                return "vaca\n";
            }
        }
    }
    
    public static String invert(String fam, String ali){
        if(fam.equals("inseto")){
            if(ali.equals("herbivoro")){
                return "lagarta\n";
            }
            else{
                return "pulga\n";
            }
            
        }
        else {
            if(ali.equals("onivoro")){
                return "minhoca\n";
            }
            else{
                return "sanguessuga\n";
            }
        }
    }
}