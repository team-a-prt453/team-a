/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifyinterfacewithadapter;

/**
 *
 * @author joelb
 */
public class BasicCoffeeMachine implements FilterCoffeeMachine {
    private Configuration config;

    private Map<CoffeeSelection, GroundCoffee> groundCoffee; private BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();
        this.config = new Configuration(30, 480);
    }

    @Override
    public Coffee brewCoffee() {
        // get the coffee
        GroundCoffee groundCoffee = this.groundCoffee.get(
            CoffeeSelection.FILTER_COFFEE);

        // brew a filter coffee
        return this.brewingUnit.brew(
            CoffeeSelection.FILTER_COFFEE, groundCoffee,
            this.config.getQuantityWater());
   }

    public void addGroundCoffee(
        CoffeeSelection sel, GroundCoffee newCoffee)
        throws CoffeeException {
        GroundCoffee existingCoffee = this.groundCoffee.get(sel);

        if (existingCoffee != null) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException(
                    "Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.groundCoffee.put(sel, newCoffee);
        }

    }
}
