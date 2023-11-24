
package com.bhas.service;

import com.bhas.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
    // DI 
    @Autowired
    private EmployeeRepo employeeRepo;
}
