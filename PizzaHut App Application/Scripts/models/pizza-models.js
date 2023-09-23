  // Data Modelling
  class Pizza{
    constructor(id, name, price, url, desc){
        // this - keyword
        // hold the current calling object reference
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.desc = desc;
        this.isAddedInCart = false;
    }
  }  
  export default Pizza;