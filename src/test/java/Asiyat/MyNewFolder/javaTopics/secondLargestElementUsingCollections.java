import java.lang.reflect.Array;
import java.util.*;

public class secondLargestElementUsingCollections {
   public static int secondLargestElement(int arr[]){
       int element;
       List<Integer>list=new ArrayList<Integer>();
       for(int i=0; i<arr.length; i++){
           list.add(arr[i]);
       }
       Collections.sort(list);
       element=list.get(list.size()-2);
       return element;
    }
    public static void main(String[] args) {
       int a[]={4,6,3,7,2};
        System.out.println(secondLargestElement(a));
    }

}
