package Strategy;


import Strategy.Strategy.PaymentByCreditCard;
import Strategy.Strategy.PaymentStrategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public void setStrategy(PaymentByCreditCard paymentByCreditCard) {
    }
}