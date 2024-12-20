import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] ostacoli = {"strada", "buca", "muro", "piscina"};
        String[] azioni={"corri","salta", "arrampicati","nuota"};
        
        System.out.println("Quanto deve essere lungo il percorso?");
        int lunghezza = sc.nextInt();

        int[] percorso = new int[lunghezza];
        for (int i =0; i<lunghezza; i++) {
            percorso[i] = r.nextInt(4);
            
        }
        for (int i = 0; i < percorso.length; i++) {
            System.out.print(ostacoli[percorso[i]]+" ");

            
        }
        System.out.println("");
        for (int i = 0; i < percorso.length; i++) {
        int sceltaAzione=r.nextInt(4);
        System.out.println("l'azione scelta è "+ azioni[sceltaAzione]);
        if (percorso[i]== sceltaAzione){
            System.out.println("l'azione è corretta per l'ostacolo "+ ostacoli[percorso[i]] );


        }else {
            System.out.println("l'azione è sbagliata");
        }

            
        }
        

        sc.close();
    }
}
