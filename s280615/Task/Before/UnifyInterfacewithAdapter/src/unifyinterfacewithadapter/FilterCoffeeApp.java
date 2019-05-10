/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifyinterfacewithadapter;

import java.util.logging.Logger;

/**
 *
 * @author joelb
 */
public class FilterCoffeeApp {
    private Logger log = Logger.getLogger(
        FilterCoffeeApp.class.getSimpleName());

    private FilterCoffeeMachine coffeeMachine;

    public FilterCoffeeApp(FilterCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee() {
        Coffee coffee = this.coffeeMachine.brewCoffee();
        log.info("Coffee is ready!");
        log.info(" -> " + coffee);
        return coffee;
    }
}

