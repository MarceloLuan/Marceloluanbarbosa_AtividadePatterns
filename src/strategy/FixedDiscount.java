package strategy;

public class FixedDiscount implements DiscountStrategy {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        double total = subtotal - amount;

        if (total < 0) {
            return 0;
        }

        return total;
    }
}
