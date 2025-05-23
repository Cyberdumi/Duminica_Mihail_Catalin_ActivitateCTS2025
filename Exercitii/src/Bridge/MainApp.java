package Bridge;

import Bridge.Abstractions.AmericanRestaurant;
import Bridge.Abstractions.ItalianRestaurant;
import Bridge.Abstractions.Restaurant;

public class MainApp {




        public static void main(String[] args) {

            Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
            americanRestaurant.deliver();

            System.out.println("==========================================");

            Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
            italianRestaurant.deliver();

        }

    }

