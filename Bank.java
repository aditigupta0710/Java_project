
class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account Account1 = new Account();
        Account1.name = "Aditi Gupta";
        Account1.email = "aditigupta.ag226@gmil.com";
        Account1.setPassword("Aditi0000");
        System.out.println(Account1.name);
        System.out.println(Account1.email);
        System.out.println(Account1.getPassword());
    }
}