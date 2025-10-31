public class bubblesort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
    public static void sorting (int[] arr){
        System.out.println("Before Sorting : ");
        print(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting : ");
        print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,6,1,3};
        sorting(arr);
    }
}
