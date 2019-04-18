/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacetypecodewithclassrefactored;


/**
 *
 * @author joelb
 */
public class Client {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Person P33 = new Person (BloodGroup.A);
       Person P34 = new Person (BloodGroup.o);
       Person P35 = new Person (BloodGroup.AB);
       System.out.println("Joel has blood group" + P33.getbloodGroup().getCode());
       System.out.println("Jack has blood group" + P34.getbloodGroup().getCode());
       System.out.println("peter has blood group" + P35.getbloodGroup().getCode());
    }
}

