package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals; // tableau d'animaux
    private String name;
    private String city;
    private static final int nbrCages = 25;
    int nbrAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        //this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("Nom : " + name + ", Ville : " + city + ", Nombre de cages : " + nbrCages);
    }


    @Override
    public String toString() {
        return "Zoo [Nom = " + name + ", Ville = " + city + ", Nombre de cages = " + nbrCages + "]";
    }

    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println(" Le zoo est plein !");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println(" L’animal " + animal.getName() + " existe déjà !");
            return false;
        }

        animals[nbrAnimals++] = animal;
        System.out.println(" " + animal.getName() + " ajouté !");
        return true;
    }

    public void affiche() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].getName() + " " + animals[i].getFamily() + " " + animals[i].getAge() + " " + animals[i].isMammal());
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (animals[i].getName().equals(animal.getName())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public boolean isZooFull() {
        if (nbrAnimals >= nbrCages) {
            System.out.println("le zoo est plein");
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(" Le nom du zoo ne peut pas être vide !");
            this.name = "Zoo par défaut";
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
}
