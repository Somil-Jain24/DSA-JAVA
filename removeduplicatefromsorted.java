
// Remove duplicate from sorted array 

public class removeduplicatefromsorted {
    public static int removeduplicate(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 7 };
        int k = removeduplicate(nums);
        System.out.println("Total unique elements " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}