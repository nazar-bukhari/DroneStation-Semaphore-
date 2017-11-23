import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class DecisionMaker extends Thread {

    private Drone drone;
    private Drone lock;

    public DecisionMaker(Drone drone,Drone lock) {

        this.drone = drone;
        this.lock = lock;
    }

    @Override
    public void run() {

        if(drone.getDroneState().equals(DroneState.Charging.getState())){

            try {
                synchronized (lock) {
                    lock.wait();
                }
                Main.semaphore.acquire();
                System.out.println(drone.getName() + " is Charging.It will take " + drone.getRechargeTime() / 1000 + " sec to recharge fully");
                Thread.sleep(drone.getRechargeTime());
                Main.semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
