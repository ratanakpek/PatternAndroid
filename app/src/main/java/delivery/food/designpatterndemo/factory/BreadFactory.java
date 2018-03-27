package delivery.food.designpatterndemo.factory;

public class BreadFactory {
    public Bread getBread(String type){
        if(type=="BRI"){
            return new Brioche();
        }else if(type=="BAG"){
            return new Baguette();
        }else if(type=="ROL"){
            return new Roll();
        }
        return null;
    }
}
