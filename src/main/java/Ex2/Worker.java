package Ex2;

public class Worker extends Human{
    private double weekSalary;
    private int workHourPerDay;

    public Worker(){

    }

    public Worker(String firstName, String lastName, double weekSalary, int workHourPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHourPerDay = workHourPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkHourPerDay() {
        return workHourPerDay;
    }

    public void setWorkHourPerDay(int workHourPerDay) {
        this.workHourPerDay = workHourPerDay;
    }

    public double moneyPerHour(){
        return this.weekSalary / this.workHourPerDay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weekSalary=" + weekSalary +
                ", workHourPerDay=" + workHourPerDay +
                '}';
    }
}
