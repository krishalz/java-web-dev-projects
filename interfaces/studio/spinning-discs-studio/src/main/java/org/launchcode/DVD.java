package org.launchcode;

// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.
public class DVD extends BaseDisc implements OpticalDisc {
    private final String director;

    public DVD(String title, int duration, String status, String director) {
        super(title, duration, status);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void spinDisc() {
        int spinRate = 1200;
        System.out.println("DVD is " + getTitle() + " directed by " + getDirector() + "\n and spins at a rate of " + spinRate + " rpm.");
    }
}
