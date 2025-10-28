
// move all zero to the end without using extra array 

public class movezerotoend {
    public static void move(int[] arr){
        int nonzero = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;
                nonzero++;
            }

        }
          
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={0,1,4,0,5,2};
        move(arr);
    }
}
