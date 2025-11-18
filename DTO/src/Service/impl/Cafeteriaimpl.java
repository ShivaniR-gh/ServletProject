package Service.impl;

import Service.services.CafeteriaService;
import dto.CafeteriaDTO;

public class Cafeteriaimpl implements CafeteriaService {
    @Override
    public void ValidateAndSave(CafeteriaDTO cafeteriaDTO) {
        System.out.println("Validation for Cafeteria ");
    }
}
