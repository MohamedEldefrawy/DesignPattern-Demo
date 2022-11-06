package builder;

import entity.DefaultPerson;


public class PersonBuilder extends DefaultPerson {
    // Optional fields
    private String address;
    private String phone;
    private int age;

    // Setting required fields of Default person
    public PersonBuilder(String firstName, String lastName) {
        super(firstName, lastName);
    }


    // Builder pattern core
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new DefaultPerson(this);
    }

}
