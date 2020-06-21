package com.example.springbootdockercomposeapi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AnimalApiTest {

    @Test
    void getAnimal() {
        //given
        AnimalApi animalApi = mock(AnimalApi.class);
        when(animalApi.getAnimals()).thenReturn(prepareMockData());
        //when
        //then
        org.hamcrest.MatcherAssert.assertThat(animalApi.getAnimals(), hasSize(2));
    }

    private List<Animal> prepareMockData(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog"));
        animals.add(new Animal("cat"));
        return animals;
    }
}