public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private double discountLevel;


    public PreferredCustomer(String name, String address, String phone, String cust_num, boolean mailingList, int loyaltyPoints) {
        super(name, address, phone, cust_num, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = calcDiscount();
    }


    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    private double calcDiscount(){
        if(loyaltyPoints>=2000){
            discountLevel = 10.0;
        } else if(loyaltyPoints>=1500){
            discountLevel = 7.0;
        } else if(loyaltyPoints>=1000){
            discountLevel = 6.0;
        } else if(loyaltyPoints>=500){
            discountLevel = 5.0;
        } else{
            discountLevel = 0.0;
        }
        return discountLevel;
    }


    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = calcDiscount();
    }

    public void addLoyaltyPoints (int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints;
        this.discountLevel = calcDiscount();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLoyalty Points: " + loyaltyPoints + "\nDiscount Level: " + discountLevel + "\n";
    }

    public static void main(String[] args) {

        PreferredCustomer PreferredCustomer2 = new PreferredCustomer();
        PreferredCustomer2.setName("Conor");
        PreferredCustomer2.setAddress("ATU");
        PreferredCustomer2.setPhone("091 775678");
        PreferredCustomer2.setCust_num("1002");
        PreferredCustomer2.setMailingList(false);
        PreferredCustomer2.addLoyaltyPoints(700);
        System.out.println(PreferredCustomer2);

        PreferredCustomer2.addLoyaltyPoints(800);
        System.out.println(PreferredCustomer2);
    }
}
