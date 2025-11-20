package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Finance", 20);
        Departement d3 = new Departement(3, "RH", 15);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("Départements : ");
        gestion.displayDepartement();

        System.out.println("Recherche 'Finance' : " + gestion.rechercherDepartement("Finance"));

        System.out.println("\nTrié par ID : ");
        System.out.println(gestion.trierDepartementById());
    }
}
