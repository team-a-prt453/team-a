/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacetypecodewithclassrefactored;

/**
/**
 *
 * @author joelb
 */
public class Person {
    
    //Private int bloodgroup 
    private BloodGroup bloodGroup; 
    
    public Person(BloodGroup bloodGroup){
        this.bloodGroup = bloodGroup;
    }
    
    
    public BloodGroup getbloodGroup(){
        return this.bloodGroup;
    }
     
     public void setBloodGroup(BloodGroup bloodGroup){
         this.bloodGroup = bloodGroup;
     }
    
}
