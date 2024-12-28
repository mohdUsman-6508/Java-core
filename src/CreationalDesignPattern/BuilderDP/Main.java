package CreationalDesignPattern.BuilderDP;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("newton")
                .setId("1")
                .setDesignation("Physicist")
                .build();

        User user1 = new User.UserBuilder()
                .setId("2")
                .setName("Issac")
                .build();

        System.out.println(user);
        System.out.println(user1);


    }
}
