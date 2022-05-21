package Ex1;

public class Baterry {
    private String model;
    private Integer hours_idle;
    private Integer hour_talk;

    public Baterry(String model) {
        this.model = model;
        this.hours_idle = null;
        this.hour_talk = null;
    }

    public Baterry(String model, Integer hours_idle) {
        this.model = model;
        this.hours_idle = hours_idle;
        this.hour_talk = null;
    }

    public Baterry(String model, Integer hours_idle, Integer hour_talk) {
        this.model = model;
        this.hours_idle = hours_idle;
        this.hour_talk = hour_talk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHours_idle() {
        return hours_idle;
    }

    public void setHours_idle(Integer hours_idle) {
        this.hours_idle = hours_idle;
    }

    public Integer getHour_talk() {
        return hour_talk;
    }

    public void setHour_talk(Integer hour_talk) {
        this.hour_talk = hour_talk;
    }

    @Override
    public String toString() {
        return "Baterry{" +
                "model='" + model + '\'' +
                ", hours_idle=" + hours_idle +
                ", hour_talk=" + hour_talk +
                '}';
    }
}
