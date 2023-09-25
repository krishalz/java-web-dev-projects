package org.launchcode;


// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.
public class CD extends BaseDisc implements OpticalDisc {
    private final String artist;

    public CD(String title, int duration, String status, String artist) {
        super(title, duration, status);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void spinDisc() {
        int spinRate = 700;
        System.out.println("CD is " + getTitle() + " performed by " + getArtist() + "\n and spins at a rate of " + spinRate + " rpm.");
    }
}
