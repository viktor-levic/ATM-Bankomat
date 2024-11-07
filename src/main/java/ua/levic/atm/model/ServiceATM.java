package ua.levic.atm.model;


public interface ServiceATM {

    void changePin(Card card);

    void getBalance(Card card);

    void withdraw(Card card);

    void toCount(Card card);

    boolean checkPin(Card card);

    boolean replenishAccount(Card card);

    void currencyExchange(Card card);

    void message(Card card);
}