package com.company;

import java.util.*;

public class EventLog {

    private static List<Event> eventList = new ArrayList<>();

    //initializes the list
    public EventLog () {
        eventList = new ArrayList<>();

    }

    public static boolean addEvent(Event event) throws IllegalArgumentException {
        if (event == null || event.getName() == null || event.getAction() == null) {
            System.out.println("Illegal Argument Exception");
            throw new IllegalArgumentException();
        } else if (
                event.getAction() == event.FACETOFACE ||
                event.getAction() == event.PHONECALL ||
                event.getAction() == event.TEXTMSG ||
                event.getAction() == event.UNKNOWN
                )
        {
            System.out.println(event);
            eventList.add(event);
        } else {
            System.out.println("Illegal Argument Exception");
            throw new IllegalArgumentException();
        }
        return true;
    }

    //returns the size of the list
    public int getNumEvents () {
        return -2;
    }


}
