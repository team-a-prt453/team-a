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
public interface IPoliceCarFactory
  {
        PoliceCar Create(int mileage, bool serviceRequired);
   }
    //class the focuses of police factory cars
   public class PoliceCarFactory : IPoliceCarFactory
    {
       public PoliceCar Create(int mileage, bool serviceRequired)
       {
          PoliceCar policeCar = new PoliceCar();
          policeCar.ReadForService = serviceRequired;
          policeCar.Mileage = mileage;
          return policeCar;
      }
   }
