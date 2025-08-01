import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2 };
        System.out.println(Solution(array));
    }

    public static int Solution(int[] arr) {
        Set<Integer> resultado = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int or = 0;
            for (int j = i; j < arr.length; j++) {
                or |= arr[j]; // Acumula o OR do sObject resultados;
                resultado.add(or); // Guarda o resultado no conjunto
            }
        }
        return resultado.size();
    }
}
