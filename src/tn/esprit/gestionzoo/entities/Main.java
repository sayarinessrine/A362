package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1, "Ali", "Ahmed", "IT", 3);
        Employe e2 = new Employe(2, "Salah", "Karim", "RH", 2);
        Employe e3 = new Employe(3, "Mouna", "Amira", "Finance", 4);

        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Ressources Humaines");

        AffectationHashMap affect = new AffectationHashMap();

        affect.ajouterEmployeDepartement(e1, d1);
        affect.ajouterEmployeDepartement(e2, d2);
        affect.ajouterEmployeDepartement(e3, d1);

        System.out.println("=== Affichage ===");
        affect.afficherEmployesEtDepartements();

        // Test ajouter même employé dans un autre département
        System.out.println("\n=== Modification département employé 1 ===");
        affect.ajouterEmployeDepartement(e1, d2);

        affect.afficherEmployesEtDepartements();
    }
}