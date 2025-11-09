package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbAquatic = 0;

    // Instruction 26
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbAquatic < aquaticAnimals.length) {
            aquaticAnimals[nbAquatic++] = aquatic;
        } else {
            System.out.println("Le zoo est plein d’animaux aquatiques !");
        }
    }

    // Instruction 27
    public void showAllSwim() {
        for (int i = 0; i < nbAquatic; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Instruction 29
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbAquatic; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    // Instruction 30
    public void displayNumberOfAquaticsByType() {
        int countPenguins = 0;
        int countDolphins = 0;

        for (int i = 0; i < nbAquatic; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                countPenguins++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                countDolphins++;
            }
        }

        System.out.println("Nombre de Pingouins : " + countPenguins);
        System.out.println("Nombre de Dauphins : " + countDolphins);
    }
}
