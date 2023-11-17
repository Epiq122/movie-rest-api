package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Customer;
import ca.robertgleason.movie.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
