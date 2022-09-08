import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        PersonComparator pComp = new PersonComparator(5);
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Thomas", "Jefferson Murdok III", 29));
        personList.add(new Person("Thomas", "Jefferson Murdok Levy IV", 18));
        personList.add(new Person("Thomas", "Jefferson Murdok Levy Mattew V", 12));
        personList.add(new Person("Thomas", "Jefferson II", 47));
        personList.add(new Person("Thomas", "Jefferson I", 14));
        personList.add(new Person("Thomas", "Jefferson ", 23));
        System.out.println("Список лиц:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));

        Collections.sort(personList, pComp);

        System.out.println("\nСписок лиц по знатности:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));

        Predicate<Person> eraser = (Person p) -> {
            return p.getAge() < 18;
        };
        personList.removeIf(eraser);
        System.out.println("\nСписок лиц старше 18 лет:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));
    }
}