package demo.testexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.testexample.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
