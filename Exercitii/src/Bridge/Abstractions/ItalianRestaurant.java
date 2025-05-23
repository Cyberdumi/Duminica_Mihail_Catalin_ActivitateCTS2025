package Bridge.Abstractions;

import Bridge.VeggiePizza;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(VeggiePizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("-");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thin");
    }

}