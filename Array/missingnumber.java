public class missingnumber {
         public static void missing (int[] arr) {
        int n = arr.length;
        int p = (n * (n + 1)) / 2;
        int t = 0;
        for (int k : arr) {
            t = t + k;
        }
        System.out.println("Your missing term is : " + (p-t)); 
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6};
        missing(arr);
    }
}
