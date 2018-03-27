package delivery.food.designpatterndemo.abstractfactory;

public class BreadFacotory extends AbstractFactory {


    @Override
    Bread getBread(String bread) {
        if (bread == "BAG") {
            return new Baguette();
        } else if (bread == "BRI") {
            return  new Brioche();
        }
        return null;

    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }

    @Override
    Drink getDrink(String drink) {
        return null;
    }
}
