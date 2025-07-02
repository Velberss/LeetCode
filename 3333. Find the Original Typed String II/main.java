
class main {
    public static void main(String[] args) {
        int[] array = { 4, 1, 3, 3 };
        int resultado = (int) countBadPairs(array);

        System.out.println(resultado);
    }

    public static long countBadPairs(int[] nums) {
        
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] - i != nums[j] - j) {
                    cont++;
                }
            }

        }
        return cont;
    }
}
