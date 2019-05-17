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
// Ice cream flavour builder is created

public class FlavourBuilder {
    private String name;

    public FlavourBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Flavour createFlavour() {
        return new Flavour(name);
    }
}
