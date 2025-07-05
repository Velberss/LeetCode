import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] oi = { 0, 0, 0};
        a(5, oi);
    }

    public static void a(long k, int[] operations) {
        List<Character> letras = new ArrayList<>();
        letras.add('a');

        for (int i = 0; i < operations.length; i++) {
            int size = letras.size();

            if (operations[i] == 0) {
                for (int j = 0; j < size; j++) {
                    letras.add(letras.get(j)); // duplica
                }
            } else {
                for (int j = 0; j < size; j++) {
                    char c = letras.get(j);
                    char next = (char) ((c - 'a' + 1) % 26 + 'a');
                    letras.add(next); // próxima letra
                }
            }
            if (letras.size() >= k) break;
        }
        System.out.println(letras.get((int)k - 1));
    }
}
