package com.example.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    //Assignment Creates an application that displays in the browser a default value "human" or the name provided in the URL query string.
    public String index(@RequestParam(value="name", defaultValue="Human", required = false) String name,
                        @RequestParam(value="last_name", defaultValue="", required = false) String last_name,
                        @RequestParam(value="times", defaultValue="1", required = false) String times) {

        String result = "";
        int times_int = Integer.parseInt(times);

        for (int i = 0; i < times_int; i++) {
            result += "Hello " +name + " " + last_name + "\n";
        }
        return result;
    }
}
