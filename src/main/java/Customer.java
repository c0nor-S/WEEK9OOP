public class Customer extends Person{

    private String cust_num;
    private boolean mailingList;

    public Customer(String name, String address, String phone, String cust_num, boolean mailingList) {
        super(name, address, phone);
        this.cust_num = cust_num;
        this.mailingList = mailingList;
    }

    public Customer(){
        super();
        this.cust_num = "";
        this.mailingList = false;
    }

    public String getCust_num(){
        return cust_num;
    }

    public boolean getMailingList(){
        return mailingList;
    }

    public void setCust_num(String cust_num){
        this.cust_num = cust_num;
    }

    public void setMailingList(boolean mailingList){
        this.mailingList = mailingList;
    }

    @Override
    public String toString(){
    return "\nCustomer Details = " + super.toString() + " " +
             "\nCustomer Number: = '" + cust_num +
            "\nMailing List: = " + mailingList;
    }
}