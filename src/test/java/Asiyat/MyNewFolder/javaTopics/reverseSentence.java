public class reverseSentence {
    public static void main(String[] args) {
        String sentence="I Love Techtorial";
        String[]words=sentence.split(" ");
        String reverseSentence="";
        for(int i=words.length-1;i>=0;i--){
            reverseSentence+=words[i]+" ";

        }
        System.out.println(reverseSentence.trim());
    }
}
