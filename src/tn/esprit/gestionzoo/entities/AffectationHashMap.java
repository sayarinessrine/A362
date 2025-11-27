package tn.esprit.gestionzoo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe, Departement> mapAffectations = new HashMap<>();

    // Instruction 2
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        mapAffectations.put(e, d);
    }

    // Instruction 3
    public void afficherEmployesEtDepartements() {
        if (mapAffectations.isEmpty()) {
            System.out.println("Aucune affectation !");
            return;
        }

        for (Map.Entry<Employe, Departement> entry : mapAffectations.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

    // Instruction 4
    public void supprimerEmploye(Employe e) {
        mapAffectations.remove(e);
    }

    // Instruction 5
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        mapAffectations.remove(e, d);
    }

    // Instruction 6
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        mapAffectations.keySet().forEach(System.out::println);
    }

    // Instruction 7
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        mapAffectations.values().forEach(System.out::println);
    }

    // Instruction 8
    public boolean rechercherEmploye(Employe e) {
        return mapAffectations.containsKey(e);
    }

    // Instruction 9
    public boolean rechercherDepartement(Departement d) {
        return mapAffectations.containsValue(d);
    }

    // Instruction 10
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(mapAffectations); // TreeMap utilise compareTo()
    }
}