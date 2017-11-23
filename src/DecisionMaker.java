import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class DecisionMaker extends Thread {

    private Drone drone;
    private Drone lock;

    public DecisionMaker(Drone drone, Drone lock) {

        this.drone = drone;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (drone.getDroneState().equals(DroneState.Charging.getState()) ||
                drone.getDroneState().equals(DroneState.QUEUE.getState())) {

            try {

                Main.semaphore.acquire();
                System.out.println();

                System.out.println(drone.getName() + " starts charging.It will take " + drone.getRechargeTime() / 1000 + " sec to Charge");
                Thread.sleep(drone.getRechargeTime());
                System.out.println(drone.getName()+" has charged fully,going back to work." +
                        "Will come back at station after: "+drone.getWorkingHour()/1000+" seconds");
                new WorkFloor(drone).start();

                Main.semaphore.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        else if(drone.getDroneState().equals(DroneState.ATJOB.getState())){

            new WorkFloor(drone).start();
        }

    }
}
