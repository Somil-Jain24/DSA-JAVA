public class quicksort {
    public static void quick(int[] arr , int low , int high)
    {
        if(low <high)
        {
            int pi = partition (arr , low , high);

            quick(arr, low , pi-1);
            quick(arr, pi+1 , high);
        }
    }
    public static void swap (int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr , int low ,int high)
    {
        int pi = arr[high];
        int i = low - 1;
        for(int j = low ; j < high ; j++){
            if(pi> arr[j])
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1 , high);
        return i+1;

    }


    public static void main(String[] args) {
        int[] arr = {1,5,9,3,5,7,4,8,6,2,22,11,55,77,88,44,66,33,456,777};
        quick(arr, 0, arr.length-1);
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
