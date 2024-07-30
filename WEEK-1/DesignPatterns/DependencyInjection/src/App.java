public class App {
    public static void main(String[] args) throws Exception {
        CustomRepo cr = new CustomerRepositoryImpl();

        CustomerSrvc cs = new CustomerSrvc(cr);

        System.out.println(cs.getCustomerName(1));
        System.out.println(cs.getCustomerName(2));
        System.out.println(cs.getCustomerName(3));
    }
}
