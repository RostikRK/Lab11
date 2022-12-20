package Task1;

public class Main {

    public static void main(String[] args) {
        User user = User.builder().name("Rostik").ocupation("UCU").weight(70.478).age(18).build();
        System.out.println(user);
    }
}
