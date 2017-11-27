import com.sun.corba.se.spi.monitoring.MonitoredObject;

import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class ChargingStation extends Thread {

    @Override
    public void run() {

        Drone lock = new Drone();

        while (true) {

            for (Drone drone : Main.droneList) {

//                System.out.print("Current DroneState of: " + drone.toString() + "\n");
                try {
                    Thread.sleep(1000);
                    new DecisionMaker(drone, lock).start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lock) {
                lock.notifyAll();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
