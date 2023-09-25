package org.launchcode;

public abstract class BaseDisc {
    private String title;
    private int duration; //minutes long
    private String status; //new or used

    public BaseDisc(String title, int duration, String status) {
        this.title = title;
        this.duration = duration;
        this.status = status;
    }
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }

    public void spinDisc() {
        System.out.println("Now playing: " + title + " for " + duration);
    }
}
