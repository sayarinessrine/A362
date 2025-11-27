package tn.esprit.gestionzoo.entities;

public class Departement {
    private String nom;

    public Departement(String nom) {
        this.nom = nom;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;

        Departement d = (Departement) obj;
        return this.nom.equals(d.nom);
    }

    @Override
    public int hashCode() { return nom.hashCode(); }

    @Override
    public String toString() {
        return "Departement{" + "nom='" + nom + '\'' + '}';
    }
}