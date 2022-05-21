package Ex1;

import junit.framework.TestCase;

public class GSMTest extends TestCase {

    public void test1(){
        GSM[] gsms = {
                new GSM("IP", "Apple", "Hoang", new Baterry(BatteryType.LiIon.name(), 1, 1), new Display(38.5, 3)),
                new GSM("Samsung", "Samsung", "Hoang", new Baterry(BatteryType.LiIon.name(), 1, 1), new Display(38.5, 3)),
                new GSM("Oppo", "VietNam", "Hoang", new Baterry(BatteryType.LiIon.name(), 1, 1), new Display(38.5, 3))
        };

        for (GSM gsm : gsms
             ) {
            System.out.println(gsm.toString());
        }

    }
}