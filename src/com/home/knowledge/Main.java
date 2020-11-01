package com.home.knowledge;

public class Main {
    public static void main(String[] args) {

        Dogs lab = new Dogs();

        lab.setName("Charlee");
        lab.setBreed("Ovcharka");
        lab.setPaws(4);
        lab.setTail(1);

        System.out.println("First dog - is: ");
        System.out.println(lab.getName());
        System.out.println(lab.getBreed());
        System.out.println(lab.getPaws());
        System.out.println(lab.getTail());


        System.out.println();


        Dogs sheppard = new Dogs();

        System.out.println("Second dog - is: ");
        sheppard.setName("Yonsa");
        sheppard.setBreed("Bobtail");
        sheppard.setPaws(4);
        sheppard.setTail(1);

        System.out.println(sheppard.getName());
        System.out.println(sheppard.getBreed());
        System.out.println(sheppard.getPaws());
        System.out.println(sheppard.getTail());
    }
}
