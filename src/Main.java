import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        PersonComparator pcomp = new PersonComparator(5);
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Thomas", "Jefferson Murdok III", 29));
        personList.add(new Person("Thomas", "Jefferson Murdok Levy IV", 30));
        personList.add(new Person("Thomas", "Jefferson Murdok Levy Mattew V", 35));
        personList.add(new Person("Thomas", "Jefferson II", 47));
        personList.add(new Person("Thomas", "Jefferson I", 54));
        personList.add(new Person("Thomas", "Jefferson ", 23));
        System.out.println("Список лиц:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));

        Collections.sort(personList, pcomp);

        System.out.println("\nСписок лиц по знатности:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));

    }
}