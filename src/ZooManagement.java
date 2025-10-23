import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
    String zooName= "my zoo";

    public ZooManagement(){
    }
    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();

       /* System.out.println("my " + zoo.zooName + " comporte " + zoo.nbrCages + " cages.");*/

    Scanner s=new Scanner(System.in);
        do {
            System.out.print("Veuillez entrer le nom du zoo : ");
            zoo.zooName = s.nextLine();
            if (zoo.zooName.trim().isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide ");
            }
        } while (zoo.zooName.trim().isEmpty());

        do {
            System.out.print("Veuillez entrer le nombre de cages : ");
            while (!s.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier ");
                s.next();
            }
            zoo.nbrCages = s.nextInt();
            if (zoo.nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être positif");
            }
        } while (zoo.nbrCages <= 0);
        s.close();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
    }
}


