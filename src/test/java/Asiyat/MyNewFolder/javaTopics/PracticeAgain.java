import java.util.HashMap;
import java.util.Map;

public class PracticeAgain {
    public static Map howManyChars(String str){
          /*         3. Write a method that will count number of each char in a String
         countChar("abbc"); -> {a=1, b=2, c=1}*/
          Map map=new HashMap();
          int count=0;                       //a siyat
          for(int i=0; i<str.length(); i++){ // a

              for(int j=0; j<str.length(); j++){ //asiyat
                  if(str.charAt(i)==str.charAt(j)){
                      count++;

                  }
              }map.put(str.charAt(i), count);
              count=0;
          }


          return map;


}

    public static void main(String[] args) {
        String name="asiyat";
        System.out.println(howManyChars(name));
    }
}