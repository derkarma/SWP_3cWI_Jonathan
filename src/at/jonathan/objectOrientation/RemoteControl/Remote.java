package at.jonathan.objectOrientation.RemoteControl;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private List<Battery> batteries;

   public void RemoteBattery(Battery battery){
       this.batteries.add(battery);
   }

   public Remote(){
       this.batteries = new ArrayList<>();
   }

   public void turnOn(){
       int chargingStatus1 = this.batteries.get(0).getChargingStatus();
       int chargringStatus2 = this.batteries.get(1).getChargingStatus();

   }

   public void turnOff(){
       System.out.println("Kein Verbraucher angeschlossen");
   }
}




