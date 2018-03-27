package delivery.food.designpatterndemo.abstractfactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }

        if(factory=="BREAD"){
            return new BreadFacotory();
        }else if(factory=="FILLING"){
            return new FillingFacotory();
        }else if(factory=="DRINK"){
            return new DrinkFactory();
        }
        return null;
    }
}
