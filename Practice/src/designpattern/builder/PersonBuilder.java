package designpattern.builder;

public class PersonBuilder {
    private String name;
    private int age;
    private String gender;
    private float height;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder setHeight(float height) {
        this.height = height;
        return this;
    }
    public Person getPerson()
    {
        return new Person(name, age, gender, height);
    }
}

