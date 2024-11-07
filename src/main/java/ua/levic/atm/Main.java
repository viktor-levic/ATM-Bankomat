package ua.levic.atm;

import ua.levic.atm.model.Card;
import ua.levic.atm.model.ExecutiveClass;

import java.util.Scanner;

import static ua.levic.atm.model.ExecutiveClass.getCard;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your card number : ");
            Card insertedCard = getCard(scanner.nextLine());
            ExecutiveClass.getLogicsInfo(insertedCard);
        }
    }
}