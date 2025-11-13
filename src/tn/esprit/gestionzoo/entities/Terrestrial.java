package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbLegs;

    public Terrestrial(String name, String origin, int age, boolean isMammal, int nbLegs) throws InvalidAgeException {
        super(name, origin, age, isMammal);
        this.nbLegs = nbLegs;
    }

    public int getNbLegs() {
        return nbLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande 🍖");
        } else {
            System.out.println(getName() + " ne mange pas que des plantes !");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " mange des plantes 🌿");
        } else {
            System.out.println(getName() + " ne mange pas uniquement de la viande !");
        }
    }

    // 🔥 Correction ici : le nom exact doit être "eatPlantAndMeet"
    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println(getName() + " mange de tout (omnivore) 🐻");
    }
}
