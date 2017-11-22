/**
 * Created by ratul on 11/23/17.
 */
public class Drone {

    private String name;
    private long rechargeTime;
    private String droneState;

    public Drone(String name, long rechargeTime, String droneState) {
        this.name = name;
        this.rechargeTime = rechargeTime;
        this.droneState = droneState;
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

    @Override
    public String toString() {
        return  name  +
                " rechargeTime=" + rechargeTime +
                ", Working DroneState = '" + droneState + '\'' ;
    }
}
