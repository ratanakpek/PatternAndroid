package delivery.food.designpatterndemo.facade;

public class Facade {

    private Product crips;
    private Product drink;
    private Product fruit;

    public Facade(){
        crips= new Crips();
        drink= new Drink();
        fruit= new Fruit();
    }

    public int dispenseCrips(){
        return crips.dispense();
    }

    public int dispenseDrink(){
        return drink.dispense();
    }

    public int dispenseFruit(){
        return fruit.dispense();
    }
}
