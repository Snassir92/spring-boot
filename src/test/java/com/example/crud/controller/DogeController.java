package com.example.crud.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/doges")
// http://localhost:8080/doges
public class DogeController {
    @GetMapping
    public String getDoges() {
        return "This will eventually list out all of the doges";
    }
    @GetMapping("/meme") // http://localhost:8080/doges/meme
    public String sayMeme() {
        return "such wow";
    }
    @GetMapping("/{id}") // http://localhost:8080/doges/:id
    public String getDoge(@PathVariable String id) {
        return id;
    }
}