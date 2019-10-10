public class Main {
    public static void DoPrint(base o){
        o.Print();
    }

    public static void main(String[] args) {
        base x=new base();
        base y= new derivered();
        derivered z=new derivered();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}
