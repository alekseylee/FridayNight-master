public class Customer {

    private String name;
    private int age;
    private double euros;
    private boolean hasCondom;
    private int beersThatTheyDrunk;
    private int cocktailsThatTheyDrunk;
    private final double tippingAmount = 1.50;

    public Customer() {
    }

    public Customer(String name, int age, double euros, boolean hasCondom) {
        this.name = name;
        this.age = age;
        this.euros = euros;
      
        this.hasCondom = hasCondom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }



    public boolean isHasCondom() {
        return hasCondom;
    }

    public void setHasCondom(boolean hasCondom) {
        this.hasCondom = hasCondom;
    }

    public int getBeersThatTheyDrunk() {
        return beersThatTheyDrunk;
    }

    public void setBeersThatTheyDrunk(int beersThatTheyDrunk) {
        this.beersThatTheyDrunk = beersThatTheyDrunk;
    }
    
     public int getCocktailsThatTheyDrunk() {
        return cocktailsThatTheyDrunk;
    }

    public void setCocktailsThatTheyDrunk(int cocktailsThatTheyDrunk) {
        this.cocktailsThatTheyDrunk = cocktailsThatTheyDrunk;
    }


    public boolean feelingConfident(){
        //check if they drank more than 5 drinks and if they have a condom
        int amount = beersThatTheyDrunk + cocktailsThatTheyDrunk;
        if(amount > 5){
            return true;
        }
        return false;
    }

//    public int tipTheCuteStaff(Staff staff){
//
//
//        // check how many drinks you had.
//        //multiply that amount of drinks with the tippingAmount
//        //check if you have enough money. If the amount is too low,
//        //only give the amount that you have left
//        //return the amount of money you have left
//
//        if(getBeersThatTheyDrunk()+getCocktailsThatTheyDrunk()>0){
//            return int customerAmount;
//        } else if (customerAmount * tippingAmount && getEuros() > customerAmount * tippingAmount) {
//            customer.setMoney(customer.getMoney() - amount * tippingAmount);
//            staff.setMoney(staff.getMoney() + amount * tippingAmount);
//            return amount * tippingAmount;
//        }

        public int tipTheCuteStaff(Staff staff) {
            // Calculate the tip amount based on the number of drinks
            double tipAmount = getBeersThatTheyDrunk()+getCocktailsThatTheyDrunk() * tippingAmount;
            // Check if the customer has enough money to give the full tip
            if (tipAmount > getEuros()) {
                // If not, give the amount of money they have left
            }
            // Give the tip to the staff
            staff.setAmountsOfTips(tipAmount);
            // Subtract the tip from the customer's money and return the remaining amount
            double remainingMoney = getEuros() - tipAmount;
            setEuros(remainingMoney);
            return (int) remainingMoney;
        }

        }


