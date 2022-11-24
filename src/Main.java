import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Евгений","Малкин", 36));
        people.add(new Person("Александр","Пенкин", 14));
        people.add(new Person("Николвай","Хабибулин", 49));
        people.add(new Person("Екатерина ","Гарсиева", 12));
        people.add(new Person("Павел","Буре", 51));
        people.add(new Person("Ганс", "Бобруй Якутский", 29));
        System.out.println(people);
        
        Collections.sort(people,new  PetsonComparator());
        System.out.println(people);
        Collections.sort(people, new PetsonComparator());

        Predicate<Person> years18= (person)->(18>person.getAge()) ? true:false;
        people.removeIf(years18);
        System.out.println("В список не вошли кому нет 18 лет: " + people);



    }
}