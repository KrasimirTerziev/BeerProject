package com.example.beerproject.repositories;

import com.example.beerproject.exceptions.EntityNotFoundExceptions;
import com.example.beerproject.models.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class BeerRepositoryImpl {

    private List<Beer> beers;

    public BeerRepositoryImpl() {
        beers = new ArrayList<>();

        beers.add(new Beer(1, "Staropramen", 2.0));
        beers.add(new Beer(2, "Heineken", 5.0));
    }

    public List<Beer> getAll() {
        return beers;
    }

    public Beer getById(int id) {
        return beers.stream()
                .filter(beer -> beer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundExceptions("Beer", id));
    }

    public Beer getByName(String name) {
        return beers.stream()
                .filter(beer -> beer.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundExceptions("Beer", "name", name));
    }

    public void create(Beer beer) {
        beers.add(beer);
    }

    public void update(Beer beer){
        Beer beerToUpdate = getById(beer.getId());
        beerToUpdate.setName(beerToUpdate.getName());
        beerToUpdate.setAbv(beerToUpdate.getAbv());
    }
    public void delete(int id){
        Beer beerToDelete = getById(id);
        beers.remove(beerToDelete);
    }
}

