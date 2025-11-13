package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {

            Aquatic a1 = new Aquatic();
            Dolphin d1 = new Dolphin();
            Penguin p1 = new Penguin();

            Aquatic a2 = new Aquatic("Fish", 2, false, "Sea");
            Dolphin d2 = new Dolphin("Flipper", 5, true, "Ocean", 25.5f);
            Penguin p2 = new Penguin("Pingo", 3, false, "Arctic", 50.0f);
            System.out.println(a2);
            System.out.println(d2);
            System.out.println(p2);

            a2.swim();
            d2.swim();
            p2.swim();
        }}