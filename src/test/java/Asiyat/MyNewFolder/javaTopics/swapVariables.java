public class swapVariables {
    /*42.	Let's say you have an "int b=3; and int a=4;" how can you swap them? */
    public static void main(String[] args) {
        int a =4;
        int b=3;

        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a ="+a+" b="+b);
    }
}
