package com.moretolearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moretolearn.model.custom.Custom;
import com.moretolearn.repository.custom.CustomEmployeeRepository;
import com.moretolearn.model.Person;

@Repository
public interface CustomRepository extends JpaRepository<Person, Integer>, CustomEmployeeRepository{

	@Query(value = "select e.emp_id as id,p.p_name as name,e.emp_salary as salary from employee e join person p on e.emp_id = p.p_id", nativeQuery = true)
	List<Custom> getData();

	@Query("SELECT e.empId as id,p.pName as name,e.empSalary as salary FROM Employee e join Person p on e.empId = p.pId")
	List<Custom> getData1(); 

}
