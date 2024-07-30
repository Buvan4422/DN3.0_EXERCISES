public class CustomerSrvc {
    private final CustomRepo cr;

    // Constructor injection
    public CustomerSrvc(CustomRepo cr) {
        this.cr = cr;
    }

    public String getCustomerName(int id) {
        return cr.findCustomerById(id);
    }
}
