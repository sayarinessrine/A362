package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Carnivore;
public abstract class Aquatic implements Carnivore<Food> {

    protected String name;
    protected int age;
    protected String habitat;

    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }
    public abstract void swim();
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " mange de la viande dans l’eau");
        } else {
            System.out.println(name + " ne mange pas de plantes");
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;
        return age == other.age &&
                name.equals(other.name) &&
                habitat.equals(other.habitat);
    }
    public String getName() {
        return name;
    }
}
