import java.util.Comparator;

public class PetsonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int text1 = o1.getSurname().split(" ").length;
        int text2 = o2.getSurname().split(" ").length;
        if (text1 != text2) {
            return Integer.compare(text2, text1);
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }


    }
}
