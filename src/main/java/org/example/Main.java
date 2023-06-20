package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount;
        boolean registered = true;
        long bonus = service.calculate(100_000, registered);
        System.out.println(bonus);
    }
}