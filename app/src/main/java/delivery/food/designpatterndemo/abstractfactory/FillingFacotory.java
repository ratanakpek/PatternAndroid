package delivery.food.designpatterndemo.abstractfactory;

public class FillingFacotory extends AbstractFactory {


    @Override
    Bread getBread(String bread) {
        return null;

    }

    @Override
    Filling getFilling(String filling) {
        if (filling == "TO") {
            return new Tomato();
        } else if (filling == "CH") {
            return new Cheese();
        }
        return null;
    }

    @Override
    Drink getDrink(String drink) {
        return null;
    }
}
