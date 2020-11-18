package com.ez.essais;

public class TestAdressePostale {

    String numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    // Create a class constructor for the MyClass class
    public TestAdressePostale(String numRue, String libRue, int cp, String vil) {
        numeroRue = numRue;
        libelleRue = libRue;
        codePostal = cp;
        ville = vil;
    }

    public static void main(String[] args) {
        TestAdressePostale myObj = new TestAdressePostale("test", "5", 77888, "eoi");
        TestAdressePostale myObj2 = new TestAdressePostale("test", "5", 77888, "eoi");
        System.out.println(myObj.numeroRue);
    }
}
