package edu.upb.software.facadematch.Perseo;

public class Seller implements Person{
    @Override
    public void typePerson() {
        System.out.println("\nTipo Persona: Vendedor");
    }

    @Override
    public void rent() {
        System.out.println("\nNo Aplica");
    }

    @Override
    public void realEstate() {
        System.out.println("\nTiene 25 viviendas");

    }

    @Override
    public void Consortium() {
        System.out.println("\nRealiza Consorcio");
    }
}
