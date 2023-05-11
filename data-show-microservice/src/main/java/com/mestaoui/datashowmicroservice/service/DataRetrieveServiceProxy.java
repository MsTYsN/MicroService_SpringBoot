package com.mestaoui.datashowmicroservice.service;

import com.mestaoui.datashowmicroservice.dtos.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "data-retrieve", url = "${DATA_RETRIEVE_SERVICE_HOST:http://localhost}:9090/api/employees")
public interface DataRetrieveServiceProxy {

    @GetMapping
    public List<EmployeeDTO> getAll();

    @GetMapping("/fullname/{fullname}")
    public EmployeeDTO getByFullName(@PathVariable String fullname);

    @GetMapping("/company/{companyname}")
    public List<EmployeeDTO> getByCompanyName(@PathVariable String companyname);
}
