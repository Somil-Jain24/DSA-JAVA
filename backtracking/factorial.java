public class factorial {
    public static long fact(int n) {
        if(n<0){
            return -1;
        }
        if (n == 1) {
            return 1;
        } else
            return n * fact(n - 1);

    }

        static int powerOfTwo( int n) {
        if (n==0) {
        return 1;
        } else {
        var power = 2*powerOfTwo(n-1);
        return power;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(fact(20));
        System.out.println(powerOfTwo(5));;
    }
}
