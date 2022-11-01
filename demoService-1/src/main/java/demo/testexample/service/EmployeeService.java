package demo.testexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.testexample.model.Employee;
import demo.testexample.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> allemployee = (List<Employee>) employeeRepository.findAll();
		return allemployee;
	}

	
	public void postEmployee(Employee emp) {
		employeeRepository.save(emp);
	}


	public void updateEmployee(Employee emp, Integer id) {
		Optional<Employee> findById = employeeRepository.findById(id);
		Employee employee = findById.get();
		employee.setId(emp.getId());
		employee.setAddr(emp.getAddr());
		employee.setName(emp.getName());
		employeeRepository.save(employee);
	}


	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}

	
	
}
