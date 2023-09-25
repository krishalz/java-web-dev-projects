package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD rock1 = new CD("Born To Run", 56, "used", "Bruce Springsteen");
        CD jazz1 = new CD("Feels So Good", 78, "used", "Chuck Mangione");
        CD pop1 = new CD("Kaleidoscope", 54, "new", "A Great Big World");
        DVD harryPotter = new DVD("The Sorcerer's Stone", 120, "used", "Chris Columbus");
        DVD barbie = new DVD("Barbie", 112, "new", "Greta Gerwig");
        DVD orphanBlack = new DVD("Orphan Black S1", 43, "used", "John Fawcett");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        rock1.spinDisc();
        harryPotter.spinDisc();
        jazz1.spinDisc();
        barbie.spinDisc();
    }
}