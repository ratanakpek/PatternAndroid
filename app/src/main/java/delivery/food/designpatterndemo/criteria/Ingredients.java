package delivery.food.designpatterndemo.criteria;

public class Ingredients {
    String name;
    String local;
    boolean vegetarian;

    public Ingredients(String name, String local, boolean vegetarian){
        this.name=name;
        this.local=local;
        this.vegetarian=vegetarian;
    }

    public String getName(){
        return name;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
