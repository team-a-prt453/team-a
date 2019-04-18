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
public class Client {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person P1 = new Person (Person.A);
        Person P2 = new Person (Person.B);
        Person P3 = new Person (Person.AB);
        System.out.println("person has blood group" + P1.getbloodGroup());
        System.out.println("person has blood group" + P2.getbloodGroup());
        System.out.println("person has blood group" + P3.getbloodGroup());
    }
}
