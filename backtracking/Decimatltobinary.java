public class Decimatltobinary {
    public static int convert(int n){
        if(n < 0){
            return -1;
        }
        if(n==1){
            return 1;
        }else
            return (n%2) + 10 * convert(n/2);
    }
    
    public static void main(String[] args){
        System.out.println(convert(12));
    }
}
