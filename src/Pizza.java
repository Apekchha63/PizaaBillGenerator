public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToopingsAdded =false;
    private boolean isOptedForTakeAway =false;

    public Pizza(Boolean veg) { //
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice =this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;

        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToopingsAdded =true;

        this.price += extraToppingsPrice;

    }
    public void takeAway(){
        isOptedForTakeAway = true ;

        this.price += backpackPrice;
    }
    public void getBill() {
        String bill = "";
        System.out.print("Pizza:" + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isExtraToopingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "take away ad: " + backpackPrice + "\n";
        }
        bill += "Bill:" + this.price + "\n";
        System.out.println(bill);
    }
}
