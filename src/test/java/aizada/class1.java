package aizada;

public class class1 {
    public static void main(String[] args){
    //polindrome

    String name="civic";
    String reverse="";

    for(int  i= name.length()-1; i<0; i--) {
        reverse+=name.charAt(i);
            if(reverse.charAt(i)==name.charAt(i)){
                System.out.println(name+ "this is palindrome");
            }
        System.out.println("cleaning up my mess");

    }
    }
}

