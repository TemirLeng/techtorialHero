import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class fibonacci {
    public static List fib(int n){
        List list=new ArrayList();
        int num1=0;
        int num2=1;
        int sum=0;
        for(int i=0; i<n; i++){
            list.add(num1);
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        return list;
    }
    public static void main(String[] args) {
        int number =10;
        out.println(fib(number));
    }
}

