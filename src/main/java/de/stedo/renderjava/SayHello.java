package de.stedo.renderjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class SayHello {
    @GetMapping
    public String sayHi() {
        return "Yeehaa";
    }
}
