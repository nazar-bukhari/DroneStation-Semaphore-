import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created by ratul on 11/23/17.
 */
public class Main {

    static final Semaphore semaphore = new Semaphore(1);
    static List<Drone> droneList;

    public static void main(String args[]){

        Drone d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
        droneList = new ArrayList();;

        System.out.println(" ****** Drones Are initializing **********");

        d1  =	new Drone( "Drone 1",2000, DroneState.Charging.getState());
        d2  =  new Drone( "Drone 2",3000, DroneState.QUEUE.getState());
        d3  =  new Drone( "Drone 3",3000, DroneState.QUEUE.getState());
        d4  =  new Drone( "Drone 4",2000, DroneState.ATJOB.getState());
        d5  =  new Drone( "Drone 5",4000, DroneState.ATJOB.getState());
        d6  =  new Drone( "Drone 6",3000, DroneState.ATJOB.getState());
        d7  =  new Drone( "Drone 7",2000, DroneState.QUEUE.getState());
        d8  =  new Drone( "Drone 8",2000, DroneState.ATJOB.getState());
        d9  =  new Drone( "Drone 9",3000, DroneState.ATJOB.getState());
        d10 =  new Drone( "Drone 10",3000, DroneState.ATJOB.getState());

        droneList.add(d1);
        droneList.add(d2);
        droneList.add(d3);
        droneList.add(d4);
        droneList.add(d5);
        droneList.add(d6);
        droneList.add(d7);
        droneList.add(d8);
        droneList.add(d9);
        droneList.add(d10);

//        try{
//            Thread.sleep(2000);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }

        new ChargingStation().run();
//        ChargingStation chargingStation = new ChargingStation(droneList);
//        chargingStation.start();
    }
}
