package ex2;

import java.util.Comparator;

/**
 * This Comparator is for sorting ascending Human class by FirstName and LastName.
 * First, it sorts FirstName, if FirstName is equal, it sorts by LastName
 */
public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Human human1 = (Human) o1;
        Human human2 = (Human) o2;

        if (human1.getFirstName().compareTo(human2.getFirstName()) == 0){
            return human1.getLastName().compareTo(human2.getLastName());
        } else return human1.getFirstName().compareTo(human2.getFirstName());
    }
}
