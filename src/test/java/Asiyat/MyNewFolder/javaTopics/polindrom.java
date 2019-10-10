public class polindrom {
    public static boolean isPolindrom(String str){
        String n="";
        for(int i=str.length()-1; i>=0; i--){
            n+=str.charAt(i);
        }
        if(str.equals(n)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       String name="level";
        System.out.println(isPolindrom(name));
    }
}
