/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReplacingConstructorwithCreationMethod;

import java.util.Date;

/**
 *
 * @author joelb
 */

public class Hire{

    private final double outstanding;
    private final double commitment;
    private final int riskRating;
    private final Date maturity;
    
    
    // class contains a lot of constuctors 
    //dificult to decipher the purpose of each contractor
    
    
   public Hire(double commitment, int riskRating, Date maturity) {
      this(commitment, 0.00, riskRating, maturity, null);
   }
   
   public Hire(double commitment, int riskRating, Date maturity, Date expiry) {
      this(commitment, 0.00, riskRating, maturity, expiry);
   }

 public Hire(double commitment, double outstanding, 
               int customerRating, Date maturity, Date expiry) {
      this(null, commitment, outstanding, customerRating, maturity, expiry);
   }
   
   public Hire(CapitalStrategy capitalStrategy, double commitment,
               int riskRating, Date maturity, Date expiry) {
      this(capitalStrategy, commitment, 0.00, riskRating, maturity, expiry);
   }
   
   public Hire(CapitalStrategy capitalStrategy, double commitment, 
               double outstanding, int riskRating,   
               Date maturity, Date expiry) {
      this.commitment = commitment;
      this.outstanding = outstanding;
      this.riskRating = riskRating;
      this.maturity = maturity;
     
   }
}
