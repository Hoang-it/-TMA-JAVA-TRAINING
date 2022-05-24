package ex1;

public class Battery {
    private String model;
    private Integer hoursIdle;
    private Integer hourTalk;

    public Battery(String model) {
        this.model = model;
        this.hoursIdle = null;
        this.hourTalk = null;
    }

    public Battery(String model, Integer hoursIdle) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hourTalk = null;
    }

    public Battery(String model, Integer hoursIdle, Integer hourTalk) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hourTalk = hourTalk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(Integer hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public Integer getHourTalk() {
        return hourTalk;
    }

    public void setHourTalk(Integer hourTalk) {
        this.hourTalk = hourTalk;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "model='" + model + '\'' +
                ", hours_idle=" + hoursIdle +
                ", hour_talk=" + hourTalk +
                '}';
    }
}
