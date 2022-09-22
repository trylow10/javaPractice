package selfLearn;

public class paramConstructor {
    String name;
    int age;

    public paramConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        paramConstructor called = new paramConstructor("trilochan", 21);
        System.out.println("name is " + called.name+" and the age is "+called.age);
    }
}
