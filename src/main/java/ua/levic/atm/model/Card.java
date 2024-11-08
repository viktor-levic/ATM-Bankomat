package ua.levic.atm.model;

/**
 * @Company: {}
 * @Author: {levic}
 * @Project: {ATM-Bankomat}
 * @Date: {2024/11/07 && 11:55 AM}
 */

public class Card {

    public static int length;
    private String system;
    private String id;
    private String owner;
    private String pin;
    private double balance;
    boolean state; // active - true, block - false


    public Card() {
    }


    public Card(String system, String id, String owner,
                String pin, double balance, boolean state) {
        this.system = system;
        this.id = id;
        this.owner = owner;
        this.pin = pin;
        this.balance = balance;
        this.state = state;
    }


    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Card.length = length;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Card{" +
                "system='" + system + '\'' +
                ", id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", state=" + state +
                '}';
    }
}