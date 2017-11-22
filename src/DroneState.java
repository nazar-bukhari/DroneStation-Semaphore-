/**
 * Created by ratul on 11/23/17.
 */
public enum DroneState {

    ATJOB("At Job"),
    Charging("Charging"),
    QUEUE("Waiting at station");

    private String state;

    private DroneState(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
