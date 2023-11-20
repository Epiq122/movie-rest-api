package ca.robertgleason.movie.service;

import ca.robertgleason.movie.models.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {


    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);


    Customer saveNewCustomer(Customer customer);
}
