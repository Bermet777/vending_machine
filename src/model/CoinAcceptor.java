package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void acceptPayment() {
        amount += 10;
        System.out.println("Вы пополнили баланс на 10");
    }

    @Override
    public void deduct(int price) {
        amount -= price;
    }
}
