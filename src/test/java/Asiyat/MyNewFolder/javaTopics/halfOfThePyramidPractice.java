public class halfOfThePyramidPractice {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=0; i<n;i++){
//            for(int j=1; j<n; j++)
//
//        }
//
//    }

//    public static int sumDigits(long n) {
//        int result = 0;
//
//        while(n > 0) {
//            result += n % 10;
//            n /= 10;
//
//
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int num=123456;
//        System.out.println(sumDigits(num));
//    }



//    static int getProduct(int n)
//    {
//        int product = 1;
//
//        while (n != 0) {
//            product = product * (n % 10);
//            n = n / 10;
//        }
//
//        return product;
//    }


    public static int digitManipulation(int number){
        int sum=0;
        int product=1;
        int result;
        int temp;
        while(number>0){
            temp=number%10;
            number=number/10;
            sum+=temp;
            product*=temp;
        }
        result=product-sum;
      //  System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int num=123456;
        System.out.println(digitManipulation(num));
    }

}
