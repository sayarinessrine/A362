package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}

    public Animal(String name, int age, boolean isMammal) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + ", isMammal=" + isMammal + '}';
    }
}
