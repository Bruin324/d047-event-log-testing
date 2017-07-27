package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Starting test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test is finished");
        System.out.println();
    }

    @Test
    public void testProperEvent() throws Exception {
        Event event1 = new Event();
        System.out.println("Testing Proper Event");
        event1.setName("Text Event Name");
        event1.setAction("Face2Face");
        assertTrue(EventLog.addEvent(event1));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void testNullEvent() throws Exception {
        System.out.println("Testing null event");
        thrown.expect(IllegalArgumentException.class);
        EventLog.addEvent(null);
    }

    @Test
    public void testNullName() throws Exception {
        System.out.println("Testing null name");
        Event nullName = new Event();
        nullName.setName(null);
        nullName.setAction("NullName Action");
        thrown.expect(IllegalArgumentException.class);
        EventLog.addEvent(nullName);
    }

    @Test
    public void testNullAction() throws Exception {
        System.out.println("Testing null action");
        Event nullAction = new Event();
        nullAction.setName("nullAction Name");
        nullAction.setAction(null);
        thrown.expect(IllegalArgumentException.class);
        EventLog.addEvent(nullAction);
    }

    @Test
    public void testFace2Face() throws Exception {
        System.out.println("Testing Face2Face");
        Event actionFace = new Event();
        actionFace.setName("ActionFace Name");
        actionFace.setAction("Face2Face");
        assertTrue(EventLog.addEvent(actionFace));
    }

    @Test
    public void testPhoneCall() throws Exception {
        System.out.println("Testing PhoneCall");
        Event actionPhone = new Event();
        actionPhone.setName("ActionPhone Name");
        actionPhone.setAction("PhoneCall");
        assertTrue(EventLog.addEvent(actionPhone));
    }

    @Test
    public void testTextMessaging() throws Exception {
        System.out.println("Testing TextMessaging");
        Event actionText = new Event();
        actionText.setName("actionText Name");
        actionText.setAction("TextMessaging");
        assertTrue(EventLog.addEvent(actionText));
    }

    @Test
    public void testUnkownAction() throws Exception {
        System.out.println("Testing Unknown Action");
        Event actionUnknown = new Event();
        actionUnknown.setName("actionUnknown Name");
        actionUnknown.setAction("Unknown");
        assertTrue(EventLog.addEvent(actionUnknown));
    }

    @Test
    public void testBadAction() throws Exception {
        System.out.println("Testing null name");
        Event badAction = new Event();
        badAction.setName("badAction Name");
        badAction.setAction("Not an Action");
        thrown.expect(IllegalArgumentException.class);
        EventLog.addEvent(badAction);
    }

}