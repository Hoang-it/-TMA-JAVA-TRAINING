package Ex2;

import java.util.Comparator;

public class FirstAndLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Human human1 = (Human) o1;
        Human human2 = (Human) o2;

        if (human1.getFirstName().compareTo(human2.getFirstName()) == 0){
            return human1.getLastName().compareTo(human2.getLastName());
        } else return human1.getFirstName().compareTo(human2.getFirstName());
    }
}
