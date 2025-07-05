public class App {
    public static void main (String []Args){
        int[] array = {2,7,11,15};
        twoSum(array, 9);
    }
    public static int[] twoSum(int[] nums, int target) {
           int a = 0, b = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (target == (nums[i] + nums[j])) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        int[] resultado ={b,a};

        return resultado;

    }
}
