package tn.esprit.gestionzoo.entities;

public class Animal {
    private String name;
    private String origin;
    private int age;
    private boolean isMammal;

    public Animal(String name, String origin, int age, boolean isMammal) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L’âge de l’animal ne peut pas être négatif !");
        }
        this.name = name;
        this.origin = origin;
        this.age = age;
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isMammal() {
        return isMammal;
    }
}
