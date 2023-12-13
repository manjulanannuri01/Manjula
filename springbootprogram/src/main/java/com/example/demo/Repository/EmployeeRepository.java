package com.example.demo.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long>
    {
     	List<Employee> findall();
	}
