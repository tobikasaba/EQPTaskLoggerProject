package com.eqp.tasklogger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskTest {
    
    Task task = new Task("title", "this is a description", "owner@owner.com");

    @Test
    void taskContainsATitle() {
        assertEquals("title", task.title);
    }

    @Test
    void taskContainsADescription() {
        assertEquals("this is a description", task.description);
    }

    @Test
    void taskContainsAnOwner() {
        assertEquals("owner@owner.com", task.owner);
    }
}
