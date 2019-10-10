import java.util.HashMap;
import java.util.Map;

public class justpractice {
   public static Map Mapqs(String str){
       int count=0;
       Map map=new HashMap();
       for(int i=0; i<str.length();i++){
           for(int j=0; j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   count++;
               }map.put(str.charAt(i),count);

           }count=0;


       }return map;
   }


    public static void main(String[] args) {
        String name="mmmma";
        System.out.println(Mapqs(name));
    }


   }
