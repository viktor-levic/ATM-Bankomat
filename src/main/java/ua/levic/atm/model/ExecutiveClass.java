package ua.levic.atm.model;

import java.util.Scanner;

public class ExecutiveClass {

    static Card cardExample1 = new Card("UA-card", "9090 9090 9090 9090", "Makush Olexiy", "0909", 2000000, true);
    static Card cardExample2 = new Card("Humo", "9860 1234 4555 9012", "Chris Columbus", "0919", 100000, true);
    static Card cardExample3 = new Card("Visa", "1921 1010 5544 9013", "Jerry Heil", "0309", 1000, true);
    static Card cardExample4 = new Card("Master Card", "7654 9090 1214 9014", "Zina Craig", "1909", 1400, true);
    static Card cardExample5 = new Card("Union Pay", "9077 1234 2321 9015", "Nina Ivanysko", "4309", 43000, true);

    public static Card[] cards = {cardExample1, cardExample2, cardExample3, cardExample4, cardExample5};

    static ServiceATM service = new ServiceATMImplementation();

    public static void getLogicsInfo(Card insertedCard) {
        Scanner scanner = new Scanner(System.in);

        if (insertedCard != null) {
            if (service.checkPin(insertedCard)) {
                while (true) {
                    System.out.println("----------------------");
                    System.out.println("1. View card account.");
                    System.out.println("----------------------");
                    System.out.println("2. Cash withdrawal.");
                    System.out.println("----------------------");
                    System.out.println("3. Replenish the card account.");
                    System.out.println("----------------------");
                    System.out.println("4. Currency exchange.");
                    System.out.println("----------------------");
                    System.out.println("5. SMS notification.");
                    System.out.println("----------------------");
                    System.out.println("6. Change the card code.");
                    System.out.println("----------------------");
                    System.err.println("7. Exit");

                    switch (scanner.nextInt()) {
                        case 1: {
                            service.getBalance(insertedCard);
                            break;
                        }
                        case 2: {
                            service.withdraw(insertedCard);
                            break;
                        }
                        case 3: {
                            service.replenishAccount(insertedCard);
                            break;
                        }
                        case 4: {
                            service.currencyExchange(insertedCard);
                            break;
                        }
                        case 5: {
                            service.message(insertedCard);
                        }
                        case 6: {
                            service.changePin(insertedCard);
                            break;
                        }
                        case 7: {
                            return;
                        }
                    }
                }
            } else System.err.println("Write the password well...");
        }
    }

    public static Card getCard(String id) {
        Card cardIn = cardExample1;
        String cardMessage = "";
        for (Card cardExample1 : cards) {
            if (cardExample1.getId().equals(id)) {
                if (cardExample1.isState()) {
                    cardIn = cardExample1;
                    return cardIn;
                } else {
                    System.out.println("The cardExample1 does not work!!!");
                    return null;
                }
            } else {
                cardMessage = "There is no such cardExample1.";
                cardIn = null;
            }
        }
        System.out.println(cardMessage);
        return cardIn;
    }
}