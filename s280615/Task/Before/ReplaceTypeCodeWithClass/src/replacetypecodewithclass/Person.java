/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacetypecodewithclass;

/**
 *
 * @author joelb
 */
public class Person {
    
    public static final int o = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;
    
    //Private int bloodgroup 
    private int bloodGroup;
    
    public Person (int bloodGroup){
        this.bloodGroup = bloodGroup;
    }
    
     public int getbloodGroup(){
        return bloodGroup;
    }
     
     public void setBloodGroup(int bloodgroup){
         this.bloodGroup = bloodGroup;
     }
}
