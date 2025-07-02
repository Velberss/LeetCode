public class App {
    public static void main(String[] args) {
        int[] array= {2,0,2,1,1,0};
        sortColors(array);
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int aux = 0;

        while (mid <=high){
            if(nums[mid]==0){ 
                aux=nums[low];
                nums[low]=nums[mid];
                nums[mid]= aux; 
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                aux = nums[high];
                nums[high] = nums[mid];
                nums[mid] = aux;
                high--;
            }
        }
    }
}
