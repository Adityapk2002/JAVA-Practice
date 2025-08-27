package Generics;

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
        Test<String> iObj1 = new Test<String>("Aditya Khandade");
        System.out.println(iObj1.getObject());

    }
}
