package Ex2;

import java.util.Comparator;

public class GradeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        if (student1.getGrade() == student2.getGrade()) return 0;
        else if (student1.getGrade() > student2.getGrade()) return 1;
        else return -1;
    }
}
