package Person;


import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
        this.address = null;

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = null;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder newChild = new PersonBuilder();
        newChild.setSurname(surname);
        newChild.setAge(age);
        newChild.setAddress(address);
        return newChild;
    }

    public boolean hasAge(){
        if (age == 0) {
            return true;
        }else return false;

    }

    public boolean hasAddress() {
        if (address != null) {
            return  true;
        }else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\n name: " + name +
                "\n surname: " + surname +
                "\n age: " + age +
                "\n address: " + address;
    }

}
