package Encapsulation;

class Person {
    private String name;
    private int age;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Aditya");
        p.setAge(22);
        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}
