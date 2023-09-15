package org.example;

public class Main {
    public static void main(String[] args) {
        BakedGood bread = new BakedGood("Bread", 1.99, true, false);
        CannedGood peaches = new CannedGood("Peaches", .99, 16.0, false);
        Fruit apple = new Fruit("Apple", 1.99, true, true);

        System.out.println(bread.getName());
        System.out.println(peaches.getPrice());

        bread.scannerNoise();
        peaches.scannerNoise();
        apple.scannerNoise();

    }



