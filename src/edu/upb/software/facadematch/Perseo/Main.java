package edu.upb.software.facadematch.Perseo;

public class Main {
    public static void main(String[] args) {
        PersonMaker pm = new PersonMaker();
        System.out.println("\n############");
        pm.makeBuyer();
        System.out.println("\n############");
        pm.makeSeller();
    }
}
