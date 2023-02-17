public class GenericMethodDemo {
    public static <T> T getMax(T a, T b){
        System.out.println(a);
        System.out.println(b);
        System.out.println();(a.getClass().getName().equals("Integer");
    }

}

class Test{
    public static void main(String[] args) {
        Integer x=10, y=15;
        Integer z = GenericMethodDemo.getMax(x, y);
        System.out.println(x);
    }
}