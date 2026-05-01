@FunctionalInterface
interface DiscountCalculator {
// ===== TODO 1 =====
// Create a method named calculate.
// It should take double price and return double.
    public double calculate(double price);
}
public class DiscountDemo {
    public static void main(String[] args) {
    // ===== TODO 2 =====
    // Create a lambda that gives 10% discount.
    DiscountCalculator d1 = price -> price*0.9;

    // ===== TODO 3 =====
    // Create a lambda that gives 25% discount.
    DiscountCalculator d2 = price -> price * 0.75;

    double price = 100;

    // ===== TODO 4 =====
    // Print final price after 10% discount.

    System.out.println(d1.calculate(price));

    // ===== TODO 5 =====
    // Print final price after 25% discount.

    System.out.println(d2.calculate(price));
    }
}