package designpattern.builder;

public class UserBuilderExample {
    public static void main(String[] args) {
        User instance = User.UserBuilder
                .setName("trilochan")
                .setAddress("balaju")
                .setAddress()
                .build();
        System.out.println(instance);
    }
}
