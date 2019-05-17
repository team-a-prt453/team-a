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
public class Flavour{
    private String string;

// constructor

    public Flavour(String name){
        string = name;
    }

    public void setName(String name) {
        string = name;
    }

    public String getName() {
        return string;
    }

    public void saying(){
        System.out.printf("On sale for Easter today : %s\n", getName());
    }
}