package org.example;

import java.util.Scanner;


public class Drinks {
    static Scanner sc = new Scanner(System.in);
    private static final int COFFEE_PRICE = 30;
    private static final int TEA_PRICE = 25;
    private static final int LEMONADE_PRICE = 35;
    private static final int MOJITO_PRICE = 50;
    private static final int MINERAL_WATER_PRICE = 20;
    private static final int COCA_COLA_PRICE = 25;
    static int totalSum = 0, quantity = 0, billTea = 0, billCoffee = 0, billLemon = 0, billMojito = 0, billWater = 0, billCola = 0;


    public static void prepareTea() {
        System.out.println("Enter number of cup of tea:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " cups");
        billTea += quantity * TEA_PRICE;
        System.out.println("Bill on tea: " + billTea+ " ₴");
    }

    public static void prepareCoffee() {
        System.out.println("Enter number of cup of coffee:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " cups");
        billCoffee += quantity * COFFEE_PRICE;
        System.out.println("Bill on coffee: " + billCoffee+ " ₴");
    }

    public static void prepareLemonade() {
        System.out.println("Enter number of Lemonade bottles:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " bottles");
        billLemon += quantity * LEMONADE_PRICE;
        System.out.println("Bill on lemonade: " + billLemon+ " ₴");
    }

    public static void prepareMojito() {
        System.out.println("Enter number of Mojito bottles:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " bottles");
        billMojito += quantity * MOJITO_PRICE;
        System.out.println("Bill on tea: " + billMojito+ " ₴");
    }

    public static void prepareMineralWater() {
        System.out.println("Enter number of Water bottles:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " bottles");
        billWater += quantity * MINERAL_WATER_PRICE;
        System.out.println("Bill on water: " + billWater+ " ₴");
    }

    public static void prepareCocaCola() {
        System.out.println("Enter number of Cola bottles:");
        quantity = sc.nextInt();
        System.out.println("you have choosen " + quantity + " bottles");
        billCola += quantity * COCA_COLA_PRICE;
        System.out.println("Bill on cola: " + billCola+ " ₴");
    }

    public static void calculateTotalSum() {
        totalSum = billCoffee + billTea + billMojito + billLemon + billCola + billWater;
        System.out.println("Amount to be paid: " + totalSum + " ₴");
    }

    public static void proposeSmthElse() {
        System.out.println("Would you like something else? (yes/no) ?");
        String answer = sc.next();
        if (answer.equals("yes")) {
            choiceDrink();
        } else {
            System.out.println("But if it's no, it's no.");
        }
    }


    public static void showMenu() {
        System.out.println("Welcome! DrinkMachine can prepare: ");
        System.out.println();
        System.out.println("Coffee " + COFFEE_PRICE + " ₴");
        System.out.println("Tea " + TEA_PRICE + " ₴");
        System.out.println("Lemonade " + LEMONADE_PRICE + " ₴");
        System.out.println("Mojito " + MOJITO_PRICE + " ₴");
        System.out.println("Mineral water " + MINERAL_WATER_PRICE + " ₴");
        System.out.println("Coca Cola " + COCA_COLA_PRICE + " ₴");

    }


    public static void choiceDrink() {
        String s = " ";
        while (!isContain(s)) {
            System.out.print("Please choose and write a drink: ");
            s = sc.next().toUpperCase();
        }
        DrinksMachine drinksChoice = DrinksMachine.valueOf(s);
        switch (drinksChoice) {
            case TEA -> prepareTea();
            case COFFEE -> prepareCoffee();
            case LEMONADE -> prepareLemonade();
            case MOJITO -> prepareMojito();
            case WATER -> prepareMineralWater();
            case COLA -> prepareCocaCola();

        }

    }

    private static boolean isContain(String s) {
        for (DrinksMachine drink : DrinksMachine.values()) {
            if (drink.name().equals(s)) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        showMenu();
        System.out.println();
        choiceDrink();
        System.out.println("================================");
        proposeSmthElse();
        System.out.println("================================");
        calculateTotalSum();
        System.out.println("Thank you! Will wait you visit again!");


    }
}

