import java.util.Arrays;

public class addingTwoStringArrays {
    public static void main(String[] args) {
        String a[]={"aska", "amishka"};
        String b[]={"leila", "farida"};
        String sum[]=new String[a.length+b.length];
        int count=0;
        for(int i=0; i<a.length;i++){
            sum[i]=a[i];
            count++;
        }
        for(int j=0; j<b.length;j++){
            sum[count++]=b[j];
        }
        for(int k=0; k<sum.length; k++){
            System.out.print(sum[k]+" ");
        }
    }
}

