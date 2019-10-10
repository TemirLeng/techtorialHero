import java.util.Arrays;

public class ifStringBuildSameLetters {

//1. Write a method that check if a string is build out of the same letters as another string
//    same("abc","cab"); -> true
//    same("abc","abb"); -> false
    public static boolean sameLetters(String str1, String str2){
        char []a=str1.toCharArray();
        char []b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }

           return false;
    }
    public static void main(String[]args){
        System.out.println(sameLetters("abc", "cac"));
    }
    }
