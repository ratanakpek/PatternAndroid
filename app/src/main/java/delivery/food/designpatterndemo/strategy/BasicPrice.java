package delivery.food.designpatterndemo.strategy;

public class BasicPrice {
    private static BasicPrice basicPrice= new BasicPrice();
    private float price;

    private BasicPrice(){}

    public static BasicPrice getInstance(){
        return basicPrice;
    }

    protected float getPrice(){
        return price;
    }
    protected void setPrice(float v){
        price=v;
    }
}
