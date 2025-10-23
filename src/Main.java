//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Animal lion=new Animal();
        lion.name="nesrin";
        lion.age=23;
        lion.family="sa";
        lion.isMammal=false;


        myZoo.city="sbiba";
        myZoo.name="lolo";
        myZoo.nbrCages=2;


        Animal lionn=new Animal("sa","nesrin",23,false);
        Zoo myZooo=new Zoo("lolo","sbiba",2);
        /*Remarque :Après cette amélioration, le code dans la méthode main devient plus court, plus clair et plus lisible.
        Tu n’as plus besoin d’affecter chaque attribut ligne par ligne. */

        /*Animal gorilla=new Animal("gorilla","aa",2,true);
        Animal camel=new Animal("camel","bb",1,true);
        Animal giraffe=new Animal("giraffe","cc",4,true);

      myZooo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(camel.toString());*/
        Animal gorilla=new Animal("giraffe","aa",2,true);
        Animal giraffe=new Animal("giraffe","cc",4,true);
        Zoo myZoo=new Zoo("f","l",7);
        Animal a=new Animal("cc","bb",4,true);
        Animal camel=new Animal("camel","bb",1,true);
        System.out.println(myZoo.addAnimal(gorilla));
        System.out.println(myZoo.addAnimal(giraffe));
        System.out.println(myZoo.addAnimal(camel));
        myZoo.affiche();
        System.out.println("l'index nom repeat : "+myZoo.searchAnimal(a));
        System.out.println(myZoo.removeAnimal(camel));
        myZoo.affiche();
        Zoo zoo1 = new Zoo("f","l",7);
        Zoo zoo2 = new Zoo("f","l",9);

        zoo1.addAnimal(new Animal("Lion", "Felidae", 5, true));
        zoo1.addAnimal(new Animal("Tigre", "Felidae", 4, true));

        zoo2.addAnimal(new Animal("Girafe", "Giraffidae", 6, false));

        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux a : " + plusGrand.nbrAnimals + " animaux.");






    }
}