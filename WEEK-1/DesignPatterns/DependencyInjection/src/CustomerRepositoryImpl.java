public class CustomerRepositoryImpl implements CustomRepo {

    @Override
    public String findCustomerById(int id) {
        if (id == 1) {
            return "Buvan Singh found in database";
        } else if (id == 2) {
            return "Buvan Chandra Kumar Singh found in database";
        } else {
            return "Customer not found in database";
        }
    }

}
