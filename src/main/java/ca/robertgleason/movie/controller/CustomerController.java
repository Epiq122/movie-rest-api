package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Customer;
import ca.robertgleason.movie.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping()
    public List<Customer> listCustomers() {
        return customerService.listCustomers();
    }


    @GetMapping("{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") UUID customerId) {
        return customerService.getCustomerById(customerId);

    }

    @PostMapping
    public Customer saveNewCustomer(@RequestBody Customer customer) {
        return customerService.saveNewCustomer(customer);
    }


}
