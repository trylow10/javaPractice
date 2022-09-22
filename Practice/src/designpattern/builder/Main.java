package designpattern.builder;

public class Main {
    public static void main(String[] args) {

    Person p = new PersonBuilder().setName("trilochan").setAge(22).setGender("Male").getPerson();
        System.out.println(p);
    }

}
