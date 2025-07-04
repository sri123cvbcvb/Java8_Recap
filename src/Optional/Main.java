package Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("sriram", null);

        Optional<String> profilePic = Optional.ofNullable(u1.getProfilePic());


        String s = profilePic.orElse("defaultPic.jpg");

        System.out.println(s);

    }
}
