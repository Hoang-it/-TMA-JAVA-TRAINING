package Ex1;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.time.LocalTime;

public class GSMCallHistoryTest extends TestCase {
    public void test1(){
        GSM gsm = new GSM("Oppo", "VietNam", "Hoang", new Baterry(BatteryType.LiIon.name(), 1, 1), new Display(38.5, 3));
        gsm.getCallHistories().add(new Call(LocalDate.now(), LocalTime.now(), "0392661419", 1000));
        gsm.getCallHistories().add(new Call(LocalDate.now(), LocalTime.now(), "0392661419", 100));
        gsm.getCallHistories().add(new Call(LocalDate.now(), LocalTime.now(), "0392661419", 200));

        System.out.println(gsm.getCallHistories().toString());
        System.out.println("Total price: " + gsm.calcPriceCalls(0.37));
        int longest_index = 0;
        for (int i = 0; i < gsm.getCallHistories().size(); i++) {
            if (gsm.getCallHistories().get(i).getDuration() > gsm.getCallHistories().get(longest_index).getDuration()){
                longest_index = i;
            }
        }
        gsm.getCallHistories().remove(longest_index);
        System.out.println("Total price after remove: " + gsm.calcPriceCalls(0.37));
        gsm.clearCalls();
        System.out.println(gsm.getCallHistories().toString());
    }
}