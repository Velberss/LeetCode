import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int[] array = { 2,2,2,3,3 };
        int resultado = findLucky(array);
        System.out.println(resultado);
    }

    public static int findLucky(int[] arr) {
        int frequencia[] = new int[101];
        
        for (int i = 0; i < arr.length; i++) {
            int valor = arr[i];
            frequencia[valor]++; // Conta quantas vezes cada número apareceu
        }
        int maior = -1;
        for (int i = 1; i < frequencia.length; i++) {
            if (frequencia[i] == i) {
                maior = i;
            }
        }
        return maior;
    }
}
