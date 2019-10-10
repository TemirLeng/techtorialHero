import java.util.HashSet;
import java.util.Set;

public class howManyCchars {
    //asiyat
  public static int count(String s, char c){
      int count=0;
      for(int i=0; i<s.length();i++){
          if (s.charAt(i)==c) {
              count++;
          }
      }
      return count;
  }
    public static void main(String[] args) {

        String w="asssiyat";
        char co='s';
        System.out.println(count(w,co));
    }
}
