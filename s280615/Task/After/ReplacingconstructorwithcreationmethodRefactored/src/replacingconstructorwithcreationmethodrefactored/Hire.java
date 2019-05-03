/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacingconstructorwithcreationmethodrefactored;

import java.util.Date;

/**
 *
 * @author joelb
 */
public class Hire {
    
 //Before 
    
//     public Hire(double commitment, int riskRating, Date maturity) {
//      this(commitment, 0.00, riskRating, maturity, null);
//   }
    
    
    //After 
    
    //Now as a creation method

public class CapitalCalculationTest(){
   public void testTermWithRiskAdjustedCapitalStrategy() {

      Hire termHire = Hire.createTermHire(riskAdjustedCapitalStrategy, commitment,outstanding, riskRating, maturity,null);
   }
}


         //Before 
//  public Hire(double commitment, int riskRating, Date maturity, Date expiry) {
//      this(commitment, 0.00, riskRating, maturity, expiry);
//   }
   
        //AFTER - Now as a creation method
public class Hire(){
   public static Hire createTermHire(double commitment, int riskRating, Date maturity) {
      return new Hire(commitment, 0.00, riskRating, maturity, null);
   }
   

   public static Hire createTermHire(CapitalStrategy riskAdjustedCapitalStrategy,
      double commitment, double outstanding, int riskRating, Date maturity) {
      return new Hire(riskAdjustedCapitalStrategy, commitment,
         outstanding, riskRating, maturity, null);
   }
}
