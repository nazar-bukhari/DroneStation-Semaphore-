/**
 * Created by ratul on 11/23/17.
 */
public class Drone {

    private String name;
    private long rechargeTime;
    private String droneState;
    private long workingHour;
    private long distance;
    private long flightTime;

    public Drone() {
    }

    public Drone(String name, long rechargeTime, String droneState, long workingHour, long distance, long flightTime) {
        this.name = name;
        this.rechargeTime = rechargeTime;
        this.droneState = droneState;
        this.workingHour = workingHour;
        this.distance = distance;
        this.flightTime = flightTime;
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


    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public long getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(long flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", rechargeTime = " + rechargeTime +
                ", workingHour = " + workingHour +
                ", droneState = " + droneState;
    }
}
