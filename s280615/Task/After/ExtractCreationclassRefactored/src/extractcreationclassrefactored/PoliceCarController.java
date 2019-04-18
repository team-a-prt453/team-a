/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractcreationclassrefactored;

/**
 *
 * @author joelb
 */
 public class PoliceCarController
{
     
     //uses the get and set we are now retrieving from the factory class
   public IPoliceCarFactory PoliceCarFactory { get; set; }
  
     public PoliceCarController(IPoliceCarFactory policeCarFactory)
      {
         PoliceCarFactory = policeCarFactory;
     }
   
     public PoliceCar New(int mileage, bool serviceRequired)
       {
         return PoliceCarFactory.Create(mileage, serviceRequired);
    }
   }
