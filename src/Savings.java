public class Savings extends AccountClass{

    protected String safetyDepositBoxID = generateRandomString(3);
    protected String safetyDepositBoxPin = generateRandomString(4);

    public Savings(String name, String ssn, double balance) {
        super(name,
                ssn,
                String.valueOf(balance));
        accountNumber = "2"+accountNumber;
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        interestRate = super.interestRate - 0.25 ;

    }
    @Override
    public String showInfo() {
        return super.showInfo() +
                "\nACCOUNT TYPE: Savings  \n"+
                "SAFETY DEPOSIT BOX ID:" + safetyDepositBoxID + '\n' +
                "SAFETY DEPOSIT BOX PIN:" + safetyDepositBoxPin + '\n' +
                "INTEREST RATE:" + this.interestRate+'%';

    }
}