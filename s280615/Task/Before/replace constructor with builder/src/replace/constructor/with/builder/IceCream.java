/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace.constructor.with.builder;

/**
 *
 * @author joelb
 */
public class IceCream {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Flavour varietyObject = new Flavour("Chocolate ice cream");
        varietyObject.saying();
    }
}
