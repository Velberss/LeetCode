import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        generate(6);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // O primeiro elemento de cada linha é sempre 1

            for (int j = 1; j < i; j++) {
                // Cada elemento é a soma dos dois elementos acima na linha anterior
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1); // O último elemento de cada linha também é sempre 1
            triangle.add(row);
        }
        return triangle;
    }
}
