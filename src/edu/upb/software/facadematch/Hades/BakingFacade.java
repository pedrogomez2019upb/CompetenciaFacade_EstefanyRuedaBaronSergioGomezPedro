package edu.upb.software.facadematch.Hades;

public class BakingFacade {
    public boolean transferMoney() {
        PaymentService ps= new PaymentService();
        ps.payment();
        return true;
    }
}
