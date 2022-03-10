package com.ias.training.Maintenance.controllers;


import com.ias.training.Maintenance.controllers.models.MaintenanceDTO;
import com.ias.training.Maintenance.controllers.models.MaintenanceInput;
import com.ias.training.Maintenance.domain.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@RestController
public class maintenanceController {

    @RequestMapping(value = "/service", method = RequestMethod.POST)
    public MaintenanceDTO createMaintenance(@RequestBody MaintenanceInput maintenanceInput) {
        MaintenanceService maintenance = new MaintenanceService(
                new MaintenanceServiceId(UUID.randomUUID().toString()),
                maintenanceInput.getStartService(),
                maintenanceInput.getEndService(),
                new MaintenanceServiceDescription(maintenanceInput.getDescripcion())
        );

        return MaintenanceDTO.fromDomain(maintenance);
    }

    @RequestMapping(value = "/service/{id}", method = RequestMethod.GET)
    public MaintenanceDTO getMaintenance(@PathVariable("id") String maintenanceId) {
        return new MaintenanceDTO(
                maintenanceId,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "SOMO MAS"
        );
    }


    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public List<MaintenanceDTO> listMaintenance(
            @RequestParam(name = "skip", defaultValue = "0") Integer skip,
            @RequestParam(name = "limit", defaultValue = "50") Integer limit
    ) {
        return List.of();
    }


}
