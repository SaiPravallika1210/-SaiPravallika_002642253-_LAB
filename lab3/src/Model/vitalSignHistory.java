/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author balin
 */
public class vitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public vitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation>();
        
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
      public Observation createObservation(int observationId, double bloodPressure,double temperature)
      {     Observation observation = new Observation();
            observation.setBloodPressure(bloodPressure);
            observation.setTemperature(temperature);
            observation.setObservationId(observationId);
            
            //add the objects into the ArrayList
            this.vitalSignHistory.add(observation);
            return observation;
      }
      
      public Boolean checkObservationIdUnique(int id){
          for(Observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return false;
              }
          }
        return true;
      }
      
      public Observation findObservation(int id){
          for(Observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return o;
              }
          }
        return null;
      }
}
