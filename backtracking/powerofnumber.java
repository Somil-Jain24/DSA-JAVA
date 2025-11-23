public class powerofnumber{
    public static int power(int n , int p){
        if(p<0){
            return -1;
        }
        if(p==0){
            return 1;
        }
        else
            return n*power(n, p-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }



}