package main.java.com.app.api.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoriesPostController {

    @GetMapping
    public String hola_mundo() {
        return "Hola mundo desde la api";
    };

    @GetMapping("/holamundo")
    public String hola_mundo_2() {
        return "Hola mundo desde otro path";
    };

    @GetMapping("/holamundo/{name}")
    public String hola_mundo_3(@PathVariable String name) {
        return "Hola mundo " + name;
    };

    @GetMapping("/holamundo/{name}/{lastname}/{age}")
    public String hola_mundo_4(@PathVariable String name, @PathVariable String lastname, @PathVariable int age) {
        return "Hola mundo " + name + " " + lastname + " " + age;
    };

};