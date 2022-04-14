package Person;


import java.util.OptionalInt;

public class PersonBuilder {
    String name;
    String surname;
    int age;
    String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        Person person = new Person(this);
        if(this.age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        if(this.name == null | this.surname == null) {
            throw new IllegalStateException("Отсутствует имя или фамилия!");
        }else
        return person;
    }
}

