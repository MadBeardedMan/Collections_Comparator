import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
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

        Comparator<Person> pComp = (p1, p2) ->
        {
            String[] surname1 = p1.getSurname().split(" ");
            String[] surname2 = p2.getSurname().split(" ");
            if (surname1.length >= 3 && surname2.length >= 3) {
                return p1.compareTo(p2);
            }
            int last = Integer.compare(surname1.length, surname2.length);
            return last == 0 ? p1.compareTo(p2) : last;
        };

        Collections.sort(personList, pComp);

        System.out.println("\nСписок лиц по знатности:");
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));

    }
}