//reverse an array without using another array

public class reversearray{
    // public static void reverse(int [] arr){
    //     int i = 0 ;
    //     int j = arr.length -1;
    //     while(i<j){
    //         swap(arr , i , j);
    //         i++;
    //         j--;
    //     }
    //     for(int k : arr){
    //         System.out.print(k+" ");
    //     }
    // }
    public static void swap (int [] arr , int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    //reverse an array within elements 
     public static void reverseinlimit(int [] arr , int m , int n){
        int i = m ;
        int j = n;
        while(i<j){
            swap(arr , i , j);
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // reverse(arr);
        // System.out.println();
        reverseinlimit(arr, 2, 6);
    }
}
