package shop.paymants.api;

public interface Payment {

    boolean authorize(double amount);
}
