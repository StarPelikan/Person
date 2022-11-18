import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Евгений","Малкин", 36));
        people.add(new Person("Александр","Мостовой", 54));
        people.add(new Person("Николвай","Хабибулин", 49));
        people.add(new Person("Екатерина ","Гамова", 42));
        people.add(new Person("Павел","Буре", 51));
        people.add(new Person("Ганс", "Бобруй Якутский", 29));
        System.out.println(people);
        
        Collections.sort(people,new  PetsonComparator());
        System.out.println(people);
    }
}