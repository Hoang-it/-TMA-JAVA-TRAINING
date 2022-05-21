package Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRM {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hoang", "Nguyen Huu", 9.5));
        students.add(new Student("Trang", "Nguyen Huu", 8.5));
        students.add(new Student("Tran", "Nguyen Huu", 9.0));
        students.add(new Student("Lan", "Nguyen Huu", 9.3));
        students.add(new Student("Linh", "Nguyen Huu", 9.5));
        students.add(new Student("Truc", "Nguyen Huu", 9.1));
        students.add(new Student("Phuong", "Nguyen Huu", 8.5));
        students.add(new Student("Yen", "Nguyen Huu", 9.7));
        students.add(new Student("Long", "Nguyen Huu", 7.5));
        students.add(new Student("Van", "Nguyen Huu", 8.5));



        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Hoang", "Nguyen Huu", 100000, 50));
        workers.add(new Worker("Trang", "Nguyen Huu", 150000, 50));
        workers.add(new Worker("Tran", "Nguyen Huu", 140000, 50));
        workers.add(new Worker("Lan", "Nguyen Huu", 180000, 50));
        workers.add(new Worker("Linh", "Nguyen Huu", 200000, 50));
        workers.add(new Worker("Truc", "Nguyen Huu", 300000, 50));
        workers.add(new Worker("Phuong", "Nguyen Huu", 450000, 50));
        workers.add(new Worker("Yen", "Nguyen Huu", 190000, 50));
        workers.add(new Worker("Long", "Nguyen Huu", 10000, 50));
        workers.add(new Worker("Van", "Nguyen Huu", 1000, 50));

        List<Human> humans = new ArrayList<>();
        humans.addAll(students);
        humans.addAll(workers);

        System.out.println("========Students=========");

        Collections.sort(students, new GradeComparator());
        for (Student student : students
        ) {
            System.out.println(student.toString());
        }

        System.out.println("========Worker=========");
        Collections.sort(workers, new MoneyComparator());
        for (Worker worker : workers
        ) {
            System.out.println(worker.toString());
        }

        System.out.println("========Mix=========");
        Collections.sort(humans, new FirstAndLastNameComparator());
        for (Human human : humans
        ) {
            System.out.println(human.toString());
        }

    }
}
