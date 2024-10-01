import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

    // Funzione 1: Genera una lista di N numeri casuali
    public static List<Integer> generaNumeriCasuali(int N) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));  // Numeri casuali tra 0 e 100
        }
        Collections.sort(lista);  // Ordina la lista
        return lista;
    }

    // Funzione 2: Crea una nuova lista con elementi in ordine inverso
    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);
        return invertita;
    }

    // Funzione 3: Stampa elementi in posizioni pari o dispari
    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!pari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test delle funzioni
        int N = 10;  // Puoi cambiare questo valore
        List<Integer> numeri = generaNumeriCasuali(N);
        System.out.println("Lista ordinata: " + numeri);

        List<Integer> listaInvertita = invertiLista(numeri);
        System.out.println("Lista invertita: " + listaInvertita);

        System.out.println("Valori in posizioni pari:");
        stampaPosizioni(numeri, true);

        System.out.println("Valori in posizioni dispari:");
        stampaPosizioni(numeri, false);
    }
}
