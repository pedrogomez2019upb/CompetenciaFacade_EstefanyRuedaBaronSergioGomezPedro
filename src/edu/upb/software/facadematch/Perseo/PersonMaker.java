package edu.upb.software.facadematch.Perseo;

public class PersonMaker {
    private Person Seller;
    private Person Buyer;

    public PersonMaker(){
        Seller= new Seller();
        Buyer = new Buyer();
    }

    public void makeSeller(){
        Seller.typePerson();
        Seller.realEstate();
        Seller.Consortium();
        Seller.rent();
    }

    public void makeBuyer(){
        Buyer.rent();
        Buyer.realEstate();
        Buyer.typePerson();
        Buyer.Consortium();
    }
}
