public class CustomerApp {
    public static void main(String[] args){
        Customer newCust1 = new Customer("Conor", "ATU", "34567", "2d95f", false);
        System.out.println("Customer 1: ");
        System.out.println(newCust1.toString());

        Customer newCust2 = new Customer();
        newCust2.setName("Larry");
        newCust2.setAddress("UL");
        newCust2.setPhone("98765");
        newCust2.setCust_num("8c43o");
        newCust2.setMailingList(false);

        System.out.println("\nCustomer 2: ");
        System.out.println(newCust2.toString());
    }
}
