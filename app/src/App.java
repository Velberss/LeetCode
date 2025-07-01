public class App {
    public static void main(String[] args) throws Exception {

        int[] a = { 2, 1, 3, 4 };
        System.out.println(check(a));
    }

    public static boolean check(int[] nums) {

        int cont = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cont++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            cont++;
        }

        return cont <= 1;
    }
}

