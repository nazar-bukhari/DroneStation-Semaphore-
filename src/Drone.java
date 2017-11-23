/**
 * Created by ratul on 11/23/17.
 */
public class Drone {

    private String name;
    private long rechargeTime;
    private String droneState;
    private long workingHour;

    public Drone() {
    }

    public Drone(String name, long rechargeTime, String droneState, long workingHour) {
        this.name = name;
        this.rechargeTime = rechargeTime;
        this.droneState = droneState;
        this.workingHour = workingHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(long rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getDroneState() {
        return droneState;
    }

    public void setDroneState(String droneState) {
        this.droneState = droneState;
    }

    public long getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(long workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", rechargeTime = " + rechargeTime +
                ", workingHour = " + workingHour +
                ", droneState = " + droneState;
    }
}
