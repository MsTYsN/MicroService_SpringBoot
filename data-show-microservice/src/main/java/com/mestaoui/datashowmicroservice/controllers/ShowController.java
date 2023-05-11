package com.mestaoui.datashowmicroservice.controllers;

import com.mestaoui.datashowmicroservice.dtos.EmployeeDTO;
import com.mestaoui.datashowmicroservice.service.DataRetrieveServiceProxy;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/show")
@RequiredArgsConstructor
public class ShowController {

    private final DataRetrieveServiceProxy proxy;


    @GetMapping
    public List<EmployeeDTO> getAll() {
        return proxy.getAll();
    }

    @GetMapping("/fullname/{fullname}")
    public EmployeeDTO getByFullName(@PathVariable String fullname) {
        return proxy.getByFullName(fullname);
    }

    @GetMapping("/company/{companyname}")
    public List<EmployeeDTO> getByCompanyName(@PathVariable String companyname) {
        return proxy.getByCompanyName(companyname);
    }
}
