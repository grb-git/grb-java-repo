public class GenericClassDemo <T> {
    T ob;
    public GenericClassDemo(T ob){
        this.ob = ob;
    }

    public T getOb(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }    
}

class Test{
    public static void main(String[] args) {
        GenericClassDemo<Integer> ob = new GenericClassDemo<Integer>(10);
        System.out.println(ob.getOb());
        ob.showType();
    }
}

