import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] ostacoli = {"strada", "buca", "muro", "piscina"};
        
        System.out.println("Quanto deve essere lungo il percorso?");
        int lunghezza = sc.nextInt();

        String[] percorso = new String[lunghezza];
        for (int i =0; i<lunghezza; i++) {
            percorso[i] = ostacoli[r.nextInt(4)];
        }

        System.out.println(Arrays.toString(percorso));

        sc.close();
    }
}
