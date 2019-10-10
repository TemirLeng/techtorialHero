public class printOnlyUniqueLetters {
    /*         4. Write a method that will print only unique letters of given string
         printUnique("aabbc") -> "c"
         printUnique("aabc") -> "bc"
*/
    public static String unique(String str) {
        String unique = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for(int j=0; j< str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                }if(count==1){
                unique+=str.charAt(i);
            }
        }


        return unique;
    }
    public static void main(String []args){
        System.out.println(unique("asiyat"));
    }
}
