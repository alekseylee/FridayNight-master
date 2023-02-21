public class BarTender extends Staff{


    private double beerPrice;
    private double cocktailPrice;


    public BarTender(String name, double beerPrice, double cocktailPrice) {
        super(name);
        this.beerPrice = beerPrice;
        this.cocktailPrice = cocktailPrice;
    }

    public double getBeerPrice() {
        return beerPrice;
    }

    public void setBeerPrice(double beerPrice) {
        this.beerPrice = beerPrice;
    }

    public double getCocktailPrice() {
        return cocktailPrice;
    }

    public void setCocktailPrice(double cocktailPrice) {
        this.cocktailPrice = cocktailPrice;
    }



    public void buyBeer(Customer customer, int amount){
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good

        if (customer.getEuros() >= getBeerPrice()*amount){
            customer.setBeersThatTheyDrunk(customer.getBeersThatTheyDrunk() + amount);
            customer.setEuros(customer.getEuros() - getBeerPrice());
        }


    }

    public void buyCocktail(Customer customer, int amount){
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good

        if (customer.getEuros() >= getCocktailPrice()*amount){
            customer.setCocktailsThatTheyDrunk(customer.getCocktailsThatTheyDrunk() + amount);
            customer.setEuros(customer.getEuros() - getCocktailPrice());
        }

    }

}
