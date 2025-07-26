import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(maxSum(a));

    }
    
  
    public static int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 1;
        int sumAtual = 0;
        int maiorSoma = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sumAtual -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sumAtual += nums[right];
            maiorSoma = Math.max(maiorSoma, sumAtual);
        }

        return maiorSoma;
    }
}
    