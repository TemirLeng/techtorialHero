public class greatestNumber {
    public static int greatestNumber(int arr[]) {
        int largest=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {8, 100, 55, 44, 36655, 699};
        System.out.println(greatestNumber(arr));
    }
}
