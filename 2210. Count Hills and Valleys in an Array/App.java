import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] array = { 2, 4, 1, 1, 6, 5 };
        System.out.println(countHillValley(array));
    }

    public static int countHillValley(int[] nums) {
        List<Integer> cleaned = new ArrayList<>();
        cleaned.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                cleaned.add(nums[i]);
            }

        }
        int cont = 0;
        for (int i = 1; i < cleaned.size() - 1; i++) {
            int prev = cleaned.get(i - 1);
            int curr = cleaned.get(i);
            int next = cleaned.get(i + 1);

            if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                cont++;
            }
        }
        return cont;
    }
}
