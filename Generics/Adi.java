package Generics;

class Test<U, T> {
    U obj1;
    T obj2;

    Test(U obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class Adi {
    public static void main(String[] args) {
        Test<String, Integer> iobj = new Test<String, Integer>("Aditya", 22);
        iobj.print();
    }

}
