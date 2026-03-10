package com.dt.emp.Repository;

import com.dt.emp.EmployeeManagmentApplication;
import com.dt.emp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee>findByEmail(String email);
    List<Employee> findByDepartMentId(Long departmentId);
    List<Employee> findByRoleId(Long roleId);
    boolean existsByEmail(String email);
}
