package model;

import java.util.Scanner;

public class CardAcceptor implements PaymentAcceptor {
    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void acceptPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Введите одноразовый пароль: ");
        String otp = scanner.nextLine();
        amount += 50;
        System.out.println("Оплата прошла успешно. Баланс пополнен на 50");
    }

    @Override
    public void deduct(int price) {
        amount -= price;
    }
}