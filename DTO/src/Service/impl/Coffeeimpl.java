package Service.impl;

import Service.services.CoffeeService;
import dto.CoffeeDTO;

public class Coffeeimpl implements CoffeeService {

    @Override
    public void ValidateAndSave(CoffeeDTO coffeeDTO) {
        System.out.println("Coffee implemented class");
    }
}
