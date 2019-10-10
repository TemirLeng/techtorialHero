public class smallestNumber {

    public static int smallestNum(int num[]){
        int smallest=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = {34, 2, 64, 75, 100};
        System.out.println(smallestNum(num));


    }
}