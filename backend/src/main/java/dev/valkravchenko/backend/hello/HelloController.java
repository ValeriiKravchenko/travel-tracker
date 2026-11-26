package dev.valkravchenko.backend.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "Hello, Travel Tracker!";
    }

    public record HelloResponse(String message, String version){}

    @GetMapping
    public HelloResponse helloJson() {
        return new HelloResponse("Hello, Travel Tracker!", "0.0.1");
    }
}
