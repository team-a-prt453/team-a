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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joelb
 */
public class BloodGroup {
    
    public static final BloodGroup o = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    public static final BloodGroup [] values = {o,A,B,AB};
    
    private final int code;
    
    public BloodGroup(int code){
        this.code = code;
    }
    
    public static BloodGroup code (int arg){
        return values[arg];
    }
    
    public int getCode(){
        return code;
    }
}
