import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] Args) {
        int[] players = {1,1000000000 };
        int[] trainers = {1000000000,1};
        matchPlayersAndTrainers(players, trainers);
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        List<Integer> usados = new ArrayList<>(); 
        int cont = 0;

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < trainers.length; j++) {
                if (usados.contains(j)) {
                    continue;
                }

                System.out.println("player: " + players[i] + " - trainer: " + trainers[j]);

                if (players[i] <= trainers[j]) {
                    cont++; // Encontrou um par
                    usados.add(j); 
                    break; 
                }
            }
        }
        System.out.println("Total de pares: " + cont);
        return cont;
    }
}
