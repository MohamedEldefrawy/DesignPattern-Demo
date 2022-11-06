package entity;

import builder.PersonBuilder;
import builder.Person;

public class DefaultPerson implements Person {
    //  Required
    private final String firstName;
    private final String lastName;
    // Optional
    protected String address;
    protected String phone;
    protected int age;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public DefaultPerson(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.phone = personBuilder.getPhone();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
