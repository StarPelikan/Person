public class Person {
    private String name;
    private String surname;
    private int age;

    // создайте конструктор на все поля

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public String setName() {
        return this.name = name;
    }

    public String setSurname() {
        return this.surname = surname;
    }

    public int setAge() {
        return this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }


}

