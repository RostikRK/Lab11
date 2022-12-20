package Task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@ToString
@SuperBuilder
public class User extends Human {
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular
    private List<String> ocupations;
}
