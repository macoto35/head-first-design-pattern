public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage expresso = new Espresso();
        System.out.println(expresso.getDescription() + " $" + expresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(CoffeeSize.VENTI);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(CoffeeSize.GRANDE);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}