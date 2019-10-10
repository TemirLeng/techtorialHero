import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromArrayInt {
    public static void main(String[] args) {
        int count=8;
        int n1=0;
        int n2=1;
        for(int i=0; i<count;i++){
            System.out.print(n1+" ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }


}
