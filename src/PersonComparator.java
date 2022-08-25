import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private final int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person p1, Person p2) {
        String[] surname1 = p1.getSurname().split(" ");
        String[] surname2 = p2.getSurname().split(" ");
        if (surname1.length >= maxWords && surname2.length >= maxWords) {
            return p1.compareTo(p2);
        }
        int last = Integer.compare(surname1.length, surname2.length);
        return last == 0 ? p1.compareTo(p2) : last;
    }
}