package tn.esprit.gestionzoo.entities;

public class Aquatic { protected String name;
    protected int age;
    protected String habitat;

    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Instruction 28 : rendre swim() obligatoire dans les classes filles
    public abstract void swim();

    // Instruction 31 : redéfinir equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;
        return age == other.age &&
                name.equals(other.name) &&
                habitat.equals(other.habitat);
    }
}