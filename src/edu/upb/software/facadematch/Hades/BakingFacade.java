package edu.upb.software.facadematch.Hades;

public class BakingFacade {
    public boolean transferMoney() {
        SavingAccount sa= new SavingAccount();
        PaymentService ps= new PaymentService();
        sa.accountType();
        ps.payment();
        return true;
    }
}
