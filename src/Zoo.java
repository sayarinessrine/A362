public class Zoo {
    Animal[] animals; // tableau d'animaux
    String name;
    String city;
    int nbrCages;


    public Zoo() {

    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println("Nom : " + name + ", Ville : " + city + ", Nombre de cages : " + nbrCages);
    }


    @Override
    public String toString() {
        return "Zoo [Nom = " + name + ", Ville = " + city + ", Nombre de cages = " + nbrCages + "]";
    }
}
