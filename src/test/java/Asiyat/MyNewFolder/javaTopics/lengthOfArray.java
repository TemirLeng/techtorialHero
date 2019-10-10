public class lengthOfArray {
    public static int size(String str){
        char arr[]=str.toCharArray();
        int count=0;
        for(char a: arr){
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        System.out.println(size("asiyt"));
    }
}
