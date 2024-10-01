import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        System.out.println("Inserisci il numero di parole:");
        int N = scanner.nextInt();
        scanner.nextLine(); // consumare la nuova linea

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci parola " + (i + 1) + ":");
            String parola = scanner.nextLine();

            // Se l'inserimento fallisce, è un duplicato
            if (!parole.add(parola)) {
                duplicate.add(parola);
            }
        }

        // Stampa parole duplicate
        System.out.println("Parole duplicate: " + duplicate);

        // Stampa numero parole distinte
        System.out.println("Numero di parole distinte: " + parole.size());

        // Stampa elenco parole distinte
        System.out.println("Elenco parole distinte: " + parole);
    }
}
