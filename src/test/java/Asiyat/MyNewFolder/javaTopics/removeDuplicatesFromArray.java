import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        int[]arr=new int[5];
        arr[0]=2;
        arr[1]=2;
        arr[2]=5;
        arr[3]=5;
        arr[4]=20;

        Set<Integer> set=new HashSet<Integer>();
        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
//        for(int a: set){
//            System.out.println(a);
//        }
        //Remove duplicates without using Set
        String values="";


    }
}
