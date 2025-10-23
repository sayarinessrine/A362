public class Zoo {
    private Animal[] animals; // tableau d'animaux
    private String name;
    private String city;
    private static final int nbrCages = 25;
    int nbrAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
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
        int search = searchAnimal(animal);
        if (search == -1) {
            if (nbrAnimals < animals.length) {
                animals[nbrAnimals] = animal;
                nbrAnimals++;
                return true;
            }
        }
        return false;
    }

    public void affiche() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].name + " " + animals[i].family + " " + animals[i].age + " " + animals[i].isMammal);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (animals[i].name.equals(animal.name)) {
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
}
