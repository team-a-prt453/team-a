/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifyinterface.withadapterrefactored;

/**
 *
 * @author joelb
 */
public class UnifyinterfaceWithAdapterRefactored {

    /**
     * @param args the command line arguments
     */
    
    //the adapter method 
  public class FilterCoffeeAdapter implements FilterCoffeeMachine {
    private Logger log = Logger.getLogger(
        FilterCoffeeAdapter.class.getSimpleName());

    private PremiumCoffeeMachine machine;

    public FilterCoffeeAdapter(PremiumCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public Coffee brewCoffee() {
        try {
            return machine.brewCoffee(
                CoffeeSelection.FILTER_COFFEE);
        } catch (CoffeeException e) {
            log.severe(e.toString());
            return null;
        }
    }
}

}
