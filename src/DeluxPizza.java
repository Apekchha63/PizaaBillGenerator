public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {                   //const
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {}

    @Override
    public void addExtraCheese() {}
}
