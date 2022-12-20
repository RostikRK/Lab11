package Task2;

import lombok.Getter;
import lombok.Setter;

enum Gender {
    MALE, FEMALE
}

@Getter
@Setter
public class Client {
    private static int count = 0;
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender sex;

    public Client(String name, String email, int age, Gender sex) {
        id = count++;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }
}