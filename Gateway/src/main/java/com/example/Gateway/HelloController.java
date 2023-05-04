package com.example.Gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello, hi, how do you do ?");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodby(){
        return ResponseEntity.ok("Goodby my n word, go back to the gulag");

    }

}
