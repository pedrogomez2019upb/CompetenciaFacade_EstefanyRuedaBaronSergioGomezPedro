package edu.upb.software.facadematch.Perseo;

public class Buyer implements Person{
    @Override
    public void typePerson() {
        System.out.println("\nTipo Persona: Comprador");
    }

    @Override
    public void rent() {
        System.out.println("\nRenta Actual :$420 USD");
    }

    @Override
    public void realEstate() {
        System.out.println("\nTiene 2 Viviendas");
    }

    @Override
    public void Consortium() {
        System.out.println("\nNo Aplica");
    }
}
