import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class ChargingStation extends Thread{

    private List<Drone> droneList;
    private Semaphore semaphore;

    public ChargingStation(List<Drone> droneList, Semaphore semaphore) {

        this.droneList = droneList;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

       for(Drone drone : droneList){

           System.out.print("Current DroneState of: "+drone.toString()+"\n");
           try {
               Thread.sleep(1000);
               new DecisionMaker(drone,semaphore).start();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
