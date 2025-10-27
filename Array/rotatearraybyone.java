
public class rotatearraybyone {
    public static void rotate(int [] arr){
        int a = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = a;

        for(int k : arr){
            System.out.print(k+ " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        rotate(arr);
    }
}
