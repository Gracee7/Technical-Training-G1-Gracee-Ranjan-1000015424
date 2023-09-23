import makeNetworkCall from './api-client.js';
import {URL} from '../utils/config.js';
import Pizza from '../models/pizza-models.js';

 const pizzaOperations = {
    pizzas:[],
    searchPizza(pizzaid){
        const pizzaObject = this.pizzas.find((pizza)=>pizza.id == pizzaid);
        pizzaObject.isAddedInCart = true;
    },
    async getPizzas(){
        // Api Client (Objects (Pizza))
        const data = await makeNetworkCall(URL);
        const pizzaJSON  = data['Vegetarian'];
        
        const pizzas = pizzaJSON.map(singlePizza =>{
            const pizzaObject = new Pizza(singlePizza.id,
                singlePizza.name, singlePizza.price
                , singlePizza.assets
                .product_details_page[0].url,
                 singlePizza.menu_description);
                 return pizzaObject;
        });
        this.pizzas = pizzas;
        return pizzas;
        // Data Map to Model (Conversion)
        // return Model
    }
}

export default pizzaOperations;

/*
export async function getPizzas(){
    // Api Client (Objects (Pizza))
    const data = await makeNetworkCall(URL);
    const pizzaJSON  = data['Vegetarian'];
    
    const pizzas = pizzaJSON.map(singlePizza =>{
        const pizzaObject = new Pizza(singlePizza.id, 
            singlePizza.name, singlePizza.price
            , singlePizza.assets
            .product_details_page[0].url,
             singlePizza.menu_description);
             return pizzaObject;
    })
    return pizzas;
    // Data Map to Model (Conversion)
    // return Model
}
*/