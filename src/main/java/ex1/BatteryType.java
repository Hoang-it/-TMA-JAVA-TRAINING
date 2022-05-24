package ex1;

public enum BatteryType {
    LI_ION("LiIon"), NI_MH("NiMH"), NI_CD("NiCd");

    private final String batteryName;

    BatteryType(String batteryName) {
        this.batteryName = batteryName;
    }

    public String getBatteryName() {
        return batteryName;
    }
}
