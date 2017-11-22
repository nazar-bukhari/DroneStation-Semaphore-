import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class DecisionMaker extends Thread {

    private Drone drone;
    private Semaphore semaphore;

    public DecisionMaker(Drone drone, Semaphore semaphore) {

        this.drone = drone;
        this.semaphore =semaphore;
    }

    @Override
    public void run() {

        if(drone.getDroneState().equals(DroneState.Charging.getState())){

            try {
                semaphore.acquire();
                System.out.println(drone.getName()+" is Charging.It will take "+drone.getRechargeTime()/1000+" sec to recharge fully");
                Thread.sleep(drone.getRechargeTime());
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
