package mak.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import mak.pojo.Employee;
import mak.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class EmployeeService {

    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    public Optional<Employee> get(Integer id) {
        long startTime = System.currentTimeMillis();
        log.debug("entered get EmployeeService.get({})",id);
        Optional<Employee> result = employeeRepository.findById(id);
        log.debug("totalTime = {} in millis",System.currentTimeMillis() - startTime );
        return result;
    }
}
