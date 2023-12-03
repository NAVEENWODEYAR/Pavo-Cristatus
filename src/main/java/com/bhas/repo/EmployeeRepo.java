
package com.bhas.repo;
import com.bhas.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
    
}
