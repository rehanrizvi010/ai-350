package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*@[A-Za-z0-9](?:[A-Za-z0-9-]{0,61}[A-Za-z0-9])?(?:\\.[A-Za-z0-9](?:[A-Za-z0-9-]{0,61}[A-Za-z0-9])?)*$";

    @GetMapping("/hello")
    public String hello() {
        
        return "Hello, World! with git";
    }

    @GetMapping("/validate-email")
    public boolean isValidEmail(@RequestParam String email) {
        int atIndex = email.indexOf('@');
        return email.length() <= 254
                && atIndex > 0
                && atIndex <= 64
                && email.matches(EMAIL_PATTERN);
    }
}
