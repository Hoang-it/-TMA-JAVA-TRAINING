package ex1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Call {
    private LocalDate day;
    private LocalTime time;
    private String dialedPhoneNumber;
    private Integer duration;

    public Call(LocalDate day, LocalTime time, String dialedPhoneNumber, Integer duration) {
        this.day = day;
        this.time = time;
        this.dialedPhoneNumber = dialedPhoneNumber;
        this.duration = duration;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDialedPhoneNumber() {
        return dialedPhoneNumber;
    }

    public void setDialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Call{" +
                "day=" + day +
                ", time=" + time +
                ", dialedPhoneNumber='" + dialedPhoneNumber + '\'' +
                ", duration=" + duration +
                '}';
    }
}
