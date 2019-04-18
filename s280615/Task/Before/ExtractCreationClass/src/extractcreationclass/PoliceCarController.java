/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractcreationclass;

/**
 *
 * @author joelb
 */

public class PoliceCarController
   {
       public PoliceCar New(int mileage, bool serviceRequired)
        {
            //more features can be added to make it overloaded
           PoliceCar policeCar = new PoliceCar();
            policeCar.ServiceRequired = serviceRequired;
          policeCar.Mileage = mileage;
    
            return policeCar;
      }
   }
