class secondlargestele{

    public static int secondLargestElement(int[] nums) {
        int max = nums[0];
        int secele = Integer.MIN_VALUE;       
        for(int a : nums ){
            if(a > max ){
                secele = max;
                max = a;
            }
            if(a < max && a >secele ){
                secele = a;
            }
        }
        return secele ;    
    }
    public static void main(String[] args) {
        int[] nums = {5,4,2,1,7};
        int b = secondLargestElement(nums);
        System.out.println(b);

    }
}