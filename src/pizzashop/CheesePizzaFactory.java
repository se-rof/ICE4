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
class CheesePizzaFactory extends AbstractFactory {
    public Pizza getPizza(String pizza) {
        if(pizza.equalsIgnoreCase("Cheese")) {
            return new CheesePizza();
        }
        return null;
    }
}
