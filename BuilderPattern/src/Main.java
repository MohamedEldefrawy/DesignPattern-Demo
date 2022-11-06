import builder.PersonBuilder;
import builder.Person;

public class Main {
    public static void main(String[] args) {
//        DefaultPerson dafro = new DefaultPerson.UserBuilder("mohamed", "ahmed").age(27)
//                .address("Alex")
//                .build();
//        System.out.println(dafro);
        Person dafro = new PersonBuilder("Mohamed", "Ahmed")
                .age(21)
                .address("Alex")
                .phone("123")
                .build();

        System.out.println(dafro);
    }
}