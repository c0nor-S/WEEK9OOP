public class Person {
    private String name;
    private String address;
    private String phone;

    public Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Person(){
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name='" + name +
                "\nAddress='" + address +
                "\nPhone='" + phone;
    }
}
