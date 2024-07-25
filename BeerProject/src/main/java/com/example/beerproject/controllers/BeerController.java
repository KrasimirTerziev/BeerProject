package com.example.beerproject.controllers;

import com.example.beerproject.models.Beer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/beers")
public class BeerController {

    private final List<Beer> beers;

    public BeerController() {
        beers = new ArrayList<>();

        beers.add(new Beer(1, "Staropramen", 2.0));
        beers.add(new Beer(2, "Heineken", 5.0));
    }

    @GetMapping
    public List<Beer> getAll() {
        return beers;
    }

    @GetMapping("/{id}")
    public Beer getById(@PathVariable int id) {
        return beers.stream()
                .filter(beer -> beer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("Beer with id %d not found.", id)
                ));
    }

    @PostMapping
    public Beer create(@Valid @RequestBody Beer beer) {
        beers.add(beer);
        return beer;
    }
}
