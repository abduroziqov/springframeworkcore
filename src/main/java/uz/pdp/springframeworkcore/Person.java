package uz.pdp.springframeworkcore;

public class Person {
    private final String fullname;
    private final String age;

    public Person(String fullname, String age) {
        this.fullname = fullname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
