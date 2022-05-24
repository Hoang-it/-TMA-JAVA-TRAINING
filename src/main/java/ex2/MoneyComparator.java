package ex2;

import java.util.Comparator;

public class MoneyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Worker worker1 = (Worker) o1;
        Worker worker2 = (Worker) o2;

        if (worker1.moneyPerHour() == worker2.moneyPerHour()) return 0;
        else if (worker1.moneyPerHour() > worker2.moneyPerHour()) return -1;
        else return 1;
    }
}
