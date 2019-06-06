import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
 
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> jukebox= Jukebox();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] list = new int[N];
        for(int i=0;i<N;i++)
            list[i] = scan.nextInt() + scan.nextInt();
        for(int j=0;j<N;j++)
            System.out.println(jukebox.get(list[j]));
        
    }
    
    public static HashMap Jukebox(){
        HashMap<Integer,String> jukebox = new HashMap();
        jukebox.put(0,"PROXYCITY");
        jukebox.put(1,"P.Y.N.G.");
        jukebox.put(2,"DNSUEY!");
        jukebox.put(3,"SERVERS");
        jukebox.put(4,"HOST!");
        jukebox.put(5,"CRIPTONIZE");
        jukebox.put(6,"OFFLINE DAY");
        jukebox.put(7,"SALT");
        jukebox.put(8,"ANSWER!");
        jukebox.put(9,"RAR?");
        jukebox.put(10,"WIFI ANTENNAS");
        return jukebox;
    }
}