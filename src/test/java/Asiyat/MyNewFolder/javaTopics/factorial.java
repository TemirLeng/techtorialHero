public class factorial {
    public static void main(String[] args) {
        int num=8;
        int factorial=1;
        for(int i=1; i<=num; i++){
            factorial*=i;//1 2 3 4 5 6 7 8
        }
        System.out.println(factorial);
    }
}
