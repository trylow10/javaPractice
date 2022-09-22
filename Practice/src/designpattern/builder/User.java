package designpattern.builder;


public class User {
    private final String name;
    private int phone;
    private final String address;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.address = builder.address;
    }


    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }


    public static class UserBuilder {
        private String name;
        private int phone;
        private String address;


        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;

        }     public UserBuilder setAddress(String address) {
            this.address = address;
            return this;

        }

        public UserBuilder setPhone(int phone) {
            this.phone = phone;
            return this;
        }



//        public static void build() {
//            // User object and return
//            User  user = new User();

        }

    public static UserBuilder getBuilder() {
            return new UserBuilder();
    }

}
