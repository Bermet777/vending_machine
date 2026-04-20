package model;

public interface PaymentAcceptor {
    int getAmount();
    void acceptPayment();
    void deduct(int amount);
}
