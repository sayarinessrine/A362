package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Ajouter des animaux aquatiques
        Penguin p1 = new Penguin("Pingo", 3, "Antarctique", 15.5f);
        Penguin p2 = new Penguin("Lolo", 5, "Antarctique", 12.0f);
        Dolphin d1 = new Dolphin("Flipper", 8, "Océan", 25.0f);

        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);
        zoo.addAquaticAnimal(d1);

        // Afficher les méthodes swim()
        zoo.showAllSwim();

        // Tester la profondeur max
        System.out.println("Profondeur maximale des pingouins : " + zoo.maxPenguinSwimmingDepth() + " m");

        // Afficher le nombre par type
        zoo.displayNumberOfAquaticsByType();

        // Test equals()
        Penguin p3 = new Penguin("Pingo", 3, "Antarctique", 10f);
        System.out.println("p1 == p3 ? " + p1.equals(p3));
    }
}

