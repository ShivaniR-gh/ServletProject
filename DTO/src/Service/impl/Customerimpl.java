package Service.impl;

import Service.services.CafeteriaService;
import Service.services.CustomerService;
import dto.CustomerDTO;

public class Customerimpl  implements CustomerService {
    @Override
    public void save(CustomerDTO customerDTO) {
        System.out.println("Object created for customer");
    }
}
