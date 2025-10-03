//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion=new Animal();
        lion.name="nesrin";
        lion.age=23;
        lion.family="sa";
        lion.isMammal=false;

        Zoo myZoo=new Zoo();
        myZoo.city="sbiba";
        myZoo.name="lolo";
        myZoo.nbrCages=2;


        Animal lionn=new Animal("sa","nesrin",23,false);
        Zoo myZooo=new Zoo("lolo","sbiba",2);
        /*Remarque :Après cette amélioration, le code dans la méthode main devient plus court, plus clair et plus lisible.
        Tu n’as plus besoin d’affecter chaque attribut ligne par ligne. */

        Animal gorilla=new Animal("gorilla","aa",2,true);
        Animal camel=new Animal("camel","bb",1,true);
        Animal giraffe=new Animal("giraffe","cc",4,true);

      myZooo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(camel.toString());


    }
}