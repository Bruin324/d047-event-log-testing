package com.company;

public class Event {

    private String name;
    private String action;
    public final String FACETOFACE = "Face2Face";
    public final String PHONECALL = "PhoneCall";
    public final String TEXTMSG = "TextMessaging";
    public final String UNKNOWN = "Unknown";


    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
