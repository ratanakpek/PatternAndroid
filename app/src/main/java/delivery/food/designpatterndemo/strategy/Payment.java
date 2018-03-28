package delivery.food.designpatterndemo.strategy;

public class Payment {
    private Strategy strategy;

    public Payment(Strategy strategy) {
        this.strategy = strategy;
    }

    public String employStrategy(float f){
        return strategy.processPayment(f);
    }
}
