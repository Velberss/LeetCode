import java.util.*;

public class Solucao {
    public static char kthCharacter(int k) {
        List<Character> letras = new ArrayList<>();
        letras.add('a');

        while (letras.size() < k) {
            int currentSize = letras.size();
            
            for (int i = 0; i < currentSize; i++) {
                char c = letras.get(i);
                char next = (char)((c - 'a' + 1) % 26 + 'a');
                letras.add(next);
            }
        }

        return letras.get(k - 1); // 1-indexado
    }

    public static void main(String[] args) {
        System.out.println(kthCharacter(5));  // Exemplo de teste
    }
}