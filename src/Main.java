import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Евгений", "Малкин", 36));
        people.add(new Person("Ганс", "Бобруй Якутский", 29));
        people.add(new Person("Александр", "Мостовой", 54));
        people.add(new Person("Николвай", "Хабибулин", 49));
        people.add(new Person("Екатерина ", "Гамова", 42));
        people.add(new Person("Павел", "Буре", 51));

        System.out.println(people);
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int text1 = o1.getSurname().split(" ").length;
            int text2 = o2.getSurname().split(" ").length;
            if (text1 != text2) {
                return Integer.compare(text2, text1);
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}