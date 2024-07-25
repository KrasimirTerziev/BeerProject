package com.example.beerproject.services;

import com.example.beerproject.exceptions.DuplicateEntityException;
import com.example.beerproject.exceptions.EntityNotFoundExceptions;
import com.example.beerproject.models.Beer;
import com.example.beerproject.repositories.BeerRepositoryImpl;

import java.util.List;

public class BeerServiceImpl {
    public BeerRepositoryImpl repository;

    public BeerServiceImpl() {
        this.repository = new BeerRepositoryImpl();
    }

    public List<Beer> getAll() {
        return repository.getAll();
    }

    public Beer getById(int id) {
        return repository.getById(id);
    }

    public void create(Beer beer) {
        boolean duplicateExists = true;
        try {
            repository.getByName(beer.getName());
        } catch (EntityNotFoundExceptions e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("Beer", "name", beer.getName());
        }
        repository.create(beer);
    }

    public void update(Beer beer) {
        boolean duplicateExists = true;
        try {
            Beer existingBeer = repository.getByName(beer.getName());
            if (existingBeer.getId() == beer.getId()){
                duplicateExists = false;
            }
        }catch (EntityNotFoundExceptions e){
            duplicateExists = false;
        }
        if(duplicateExists){
            throw new DuplicateEntityException("Beer", "name", beer.getName());
        }
        repository.update(beer);
    }
    public void delete( int id){
        repository.delete(id);
    }
}
