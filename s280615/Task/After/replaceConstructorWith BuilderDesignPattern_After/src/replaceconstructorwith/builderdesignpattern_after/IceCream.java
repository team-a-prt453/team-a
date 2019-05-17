/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replaceconstructorwith.builderdesignpattern_after;

/**
 *
 * @author joelb
 */

// varietyBuilder added instead of constructor to the main class "apples.java"

public class IceCream {
    public static void main(String[] args){
    Flavour FlavourObject = new FlavourBuilder().setName("Chocolate Ice Cream").createFlavour();
    FlavourObject.saying();
    }
}

