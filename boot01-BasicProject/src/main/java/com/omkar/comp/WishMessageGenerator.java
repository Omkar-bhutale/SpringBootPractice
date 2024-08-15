package com.omkar.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
    private LocalDateTime date;

    static {
        System.out.println("WishMessageGenerator.class file is loading...");
    }

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator:: Zero param constructor...");
    }

    // Business Logic method
    public String greetUser(String username) {
        int hour = date.getHour();
        if (hour < 12) {
            return "Good Morning :: " + username;
        } else if (hour < 16) {
            return "Good Afternoon :: " + username;
        } else if (hour < 20) {
            return "Good Evening :: " + username;
        } else {
            return "Good Night :: " + username;
        }
    }
}
