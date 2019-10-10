import java.util.Arrays;

public class sorting {
    public static void main(String[]args){
        int []num={4,2,8,1};
        int temp;
        for(int i=0; i<num.length;i++){
            for (int j=i+1; j<num.length;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
