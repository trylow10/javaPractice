package designpattern.builder;

public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final float height;



    public Person(String name, int age, String gender, float height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                '}';
    }
}
