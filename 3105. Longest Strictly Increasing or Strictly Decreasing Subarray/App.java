public class App {
    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 3, 2 };
        System.out.println(longestMonotonicSubarray(array));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int desc = 1;
        int cresc = 1;
        int maxLen = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cresc++;
                desc = 1;
            } else if (nums[i] < nums[i + 1]) {
                desc++;
                cresc = 1;
            } else if (nums[i] == nums[i + 1]){
                cresc = 1;
                desc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(desc, cresc));        
        }
        return maxLen;
    }
}
