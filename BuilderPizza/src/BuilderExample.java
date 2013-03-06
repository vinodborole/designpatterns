/* A customer ordering a pizza. */
class BuilderExample {
  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
    PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
    //1st
    waiter.setPizzaBuilder( hawaiian_pizzabuilder );
    waiter.constructPizza();
    Pizza pizza = waiter.getPizza();
    System.out.println("1st Pizza " + pizza.getDough() + " : " + pizza.getSauce() + " : " + pizza.getTopping());
    //2nd
    waiter.setPizzaBuilder( spicy_pizzabuilder );
    waiter.constructPizza();
    pizza = waiter.getPizza();
    System.out.println("2nd Pizza " + pizza.getDough() + " : " + pizza.getSauce() + " : " + pizza.getTopping());
  }
}