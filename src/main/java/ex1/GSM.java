package ex1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GSM {
    private String model;
    private String manufacture;
    private String owner;
    private Battery battery;
    private Display characteristics;
    private List<Call> callHistories;

    public GSM(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
        this.owner = null;
        this.battery = null;
        this.characteristics = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, String owner, Battery battery, Display characteristics) {
        this.model = model;
        this.manufacture = manufacture;
        this.owner = owner;
        this.battery = battery;
        this.characteristics = characteristics;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, Battery battery, Display characteristics) {
        this.model = model;
        this.manufacture = manufacture;
        this.battery = battery;
        this.characteristics = characteristics;
        this.owner = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, String owner, Display characteristics) {
        this.model = model;
        this.manufacture = manufacture;
        this.owner = owner;
        this.characteristics = characteristics;
        this.battery = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, String owner, Battery battery) {
        this.model = model;
        this.manufacture = manufacture;
        this.owner = owner;
        this.battery = battery;
        this.characteristics = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, Display characteristics) {
        this.model = model;
        this.manufacture = manufacture;
        this.characteristics = characteristics;
        this.owner = null;
        this.battery = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, Battery battery) {
        this.model = model;
        this.manufacture = manufacture;
        this.battery = battery;
        this.owner = null;
        this.characteristics = null;
        this.callHistories = new ArrayList<>();
    }

    public GSM(String model, String manufacture, String owner) {
        this.model = model;
        this.manufacture = manufacture;
        this.owner = owner;
        this.battery = null;
        this.characteristics = null;
        this.callHistories = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBaterry() {
        return battery;
    }

    public void setBaterry(Battery battery) {
        this.battery = battery;
    }

    public Display getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Display characteristics) {
        this.characteristics = characteristics;
    }

    public List<Call> getCallHistories() {
        return callHistories;
    }

    public void setCallHistories(List<Call> callHistories) {
        this.callHistories = callHistories;
    }

    public boolean addCall(LocalDate date, LocalTime time, String dialedPhoneNumber, Integer duration){
        try {
            this.callHistories.add(new Call(date, time, dialedPhoneNumber, duration));
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    public boolean deleteCall(int index) {
        try {
            this.callHistories.remove(index);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    public boolean clearCalls(){
        try {
            this.callHistories.clear();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public double calcPriceCalls(double price){
        double sum = 0;
        for (Call call : this.callHistories
             ) {
            sum += call.getDuration() * price / 60;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "GSM{" +
                "model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", owner='" + owner + '\'' +
                ", baterry=" + battery +
                ", characteristics=" + characteristics +
                '}';
    }
}
