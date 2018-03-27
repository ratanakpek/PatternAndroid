package delivery.food.designpatterndemo.abstractfactory;

public class DrinkFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }

    @Override
    Drink getDrink(String drink) {
        if(drink=="DRI"){
            return new IceTea();
        }

        return null;
    }
}
