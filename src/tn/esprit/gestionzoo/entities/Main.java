package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "sayari", "nessrine", "IT", 2);
        Employe e2 = new Employe(2, "Trabelsi", "nour", "RH", 3);
        Employe e3 = new Employe(3, "Gharbi", "Rania", "Finance", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste initiale :");
        societe.displayEmploye();

        System.out.println("\n Recherche par nom (sayari) : " + societe.rechercherEmploye("sayari"));
        System.out.println(" Recherche par objet (e1) : " + societe.rechercherEmploye(e1));

        societe.trierEmployeParId();
        System.out.println("\n Tri par ID :");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n Tri par Département et Grade :");
        societe.displayEmploye();
    }
}
