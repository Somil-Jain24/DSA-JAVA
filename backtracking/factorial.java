public class factorial {
    public static long fact(int n){
        if(n == 1){
            return 1;
        }else
        return n * fact(n-1);
    
    }   
    
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(20));
    }
}
