import java.util.HashMap;
import java.util.Map;

public class numberOfChars {
    /*         3. Write a method that will count number of each char in a String
         countChar("abbc"); -> {a=1, b=2, c=1}
*/
    public static Map numberOfEachChar(String str){
        Map map=new HashMap();
        int count=0;
        for(int i=0; i<str.length();i++){

            for(int j=0; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }map.put(str.charAt(i),count);
            }count=0;
        }
       return map;
    }
    public static void main(String[]args){
        System.out.println(numberOfEachChar("asiyat"));
    }
}
