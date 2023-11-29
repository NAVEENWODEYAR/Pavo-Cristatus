
package com.bhas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bhas.entity.*;


@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Integer>
{
    
}
