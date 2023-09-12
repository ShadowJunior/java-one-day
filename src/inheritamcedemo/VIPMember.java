package inheritamcedemo;

public class VIPMember extends Member {

    public VIPMember(String name, int memberID, int memberSince) {
        super(name, memberID, memberSince);
    }

    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * 1200;
    }
}
