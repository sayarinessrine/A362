package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        try {

            Dolphin dolphin = new Dolphin("Flipper", 8, "Océan", 25.5f);
            Penguin penguin = new Penguin("Pingu", 4, "Antarctique", 50f);

            Terrestrial lion = new Terrestrial("Simba", "Afrique", 5, true, 4);

            System.out.println("\n🟦 Test de la nage des animaux aquatiques :");
            dolphin.swim();
            penguin.swim();

            System.out.println("\n🟥 Test des comportements alimentaires :");

            dolphin.eatMeat(Food.MEAT);
            penguin.eatMeat(Food.PLANT);

            lion.eatMeat(Food.MEAT);
            lion.eatPlant(Food.PLANT);
            lion.eatPlantAndMeet(Food.BOTH);

        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Erreur d’âge : " + e.getMessage());
        }
    }
}