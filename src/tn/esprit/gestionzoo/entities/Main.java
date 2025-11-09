package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("MonZoo", "Tunisie", 3);

        try {
            Animal a1 = new Animal("Lion", "Afrique", 5, true);
            Animal a2 = new Animal("Tigre", "Asie", -2, true); // âge négatif → exception
            zoo.addAnimal(a1);
            zoo.addAnimal(a2);
            System.out.println("Nombre d’animaux : " + zoo.getNbAnimals());
        }
        catch (InvalidAgeException e) {
            System.err.println("Erreur d’âge : " + e.getMessage());
        }
        catch (ZooFullException e) {
            System.err.println("Erreur de zoo : " + e.getMessage());
        }
    }
}
