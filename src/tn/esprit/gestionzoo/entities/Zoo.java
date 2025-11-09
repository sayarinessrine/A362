package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private int nbrCages;
    private Animal[] animals;
    private int nbAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    // ✅ Méthode demandée par l’instruction 32
    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbAnimals >= nbrCages) {
            throw new ZooFullException("Le zoo est plein ! Impossible d’ajouter un nouvel animal.");
        }
        animals[nbAnimals++] = animal;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }
}
