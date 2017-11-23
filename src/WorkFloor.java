/**
 * Created by nazar on 11/23/17.
 */
public class WorkFloor extends Thread {

    private Drone drone;

    public WorkFloor(Drone drone){
        this.drone = drone;
    }

    @Override
    public void run() {

        long droneWorkHour = drone.getWorkingHour();

        try{

            Thread.sleep(droneWorkHour);
            if(Main.semaphore.hasQueuedThreads()){
                drone.setDroneState(DroneState.QUEUE.getState());
            }else {
                drone.setDroneState(DroneState.Charging.getState());
            }
//            Main.droneList.add(drone);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
