public class linearsearch {
    public static int search(int nums[], int target) {
		for(int i = 0 ;i<nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,7,8,5,2,3,6,9,5};
        int ans = search(nums, 4);
        System.out.println(ans); 
    }
}
