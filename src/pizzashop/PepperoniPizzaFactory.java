/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 *
 * @author Rafaeru
 */
class PepperoniPizzaFactory extends AbstractFactory {

    public Pizza getPizza(String pizza) {
        if(pizza.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        }
        return null;
    } 
    
}
