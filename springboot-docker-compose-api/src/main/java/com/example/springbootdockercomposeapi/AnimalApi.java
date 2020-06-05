package com.example.springbootdockercomposeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalApi {


    private AnimalRepository animalRepository;

    public AnimalApi(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
        animalRepository.save(new Animal("dog"));
        animalRepository.save(new Animal("cat"));
    }

    @GetMapping("/animals")
    public Iterable<Animal> getAnimal(){
        return animalRepository.findAll();
    }

    @PostMapping("/animals")
    public Animal postAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }
}
