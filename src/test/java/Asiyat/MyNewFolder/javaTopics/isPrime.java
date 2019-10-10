public class isPrime {

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a=7;
        System.out.println(isPrime(a));
    }

}
