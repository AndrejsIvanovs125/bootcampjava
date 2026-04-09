package com.bootcampexcercise.module6.activity;

public class AnimalActivity {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        // Create Mammal
        Mammal mammal = new Mammal("MyPet");
        // Set Cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
        // Set Dog
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
