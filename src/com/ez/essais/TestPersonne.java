package com.ez.essais;

public class TestPersonne {
    String nomPersonne;
    String prenomPersonne;
    int codePersonne;

    // Create a class constructor for the MyClass class
    public TestPersonne(String nom, String prenom, int cp) {
        nomPersonne = nom;
        prenomPersonne = prenom;
        codePersonne = cp;
    }

    public static void main(String[] args) {
        TestAdressePostale villeLucas = new TestAdressePostale("5", "EzRue", 77888, "eoi");

        TestPersonne lucas = new TestPersonne("Reteau", "Lucas", villeLucas.codePostal);
        System.out.println(lucas.codePersonne);
    }
}
