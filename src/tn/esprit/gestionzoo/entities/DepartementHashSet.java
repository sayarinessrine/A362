package tn.esprit.gestionzoo.entities;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> set = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        set.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : set) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return set.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        set.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : set) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> ts = new TreeSet<>(
                (a, b) -> Integer.compare(a.getId(), b.getId())
        );
        ts.addAll(set);
        return ts;
    }
}