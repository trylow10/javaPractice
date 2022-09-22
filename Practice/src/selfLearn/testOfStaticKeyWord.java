package selfLearn;

public class testOfStaticKeyWord {

    static String name = "trilochan";
    static void user(){
        System.out.println(name);
    }

    static class person{
        private int age = 22;

        void display() {
            System.out.println(age);

        }

    }
    public static void main(String[] args) {
    user();
    person p1 = new person();
p1.display();
    }

}
