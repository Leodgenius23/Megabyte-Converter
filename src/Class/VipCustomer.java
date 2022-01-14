package Class;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;


    public VipCustomer(){
        System.out.println("This is a default constructor");
    }

    public VipCustomer(String name, String creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
    }
    public VipCustomer(String name, String creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
