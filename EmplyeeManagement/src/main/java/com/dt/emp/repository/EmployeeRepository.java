package com.dt.emp.repository;

import com.dt.emp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>, JpaSpecificationExecutor<Employee> {
    //Basic Find
    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByEmployeeCode(String employeeCode);
    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee>  findByRoleId(Long roleId);
    List<Employee> findByStatus(String status);

    //Exists

    boolean existsByEmail(String email);
    boolean existsByEmployeeCode(String employeeCode);

    //SEARCH

    List<Employee> findByFirstNameContainingIgnoreCase(String firstName);
    List<Employee> findByFirstNameAndLastName(String firstName,String lastName);

}
