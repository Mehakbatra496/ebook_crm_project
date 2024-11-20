package com.example2.repository;
import com.example2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>
{
	Employee findByEmail(String email);
	//SELECT * FROM register WHERE email = ?;
	
	
}

