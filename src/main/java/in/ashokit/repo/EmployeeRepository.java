package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
