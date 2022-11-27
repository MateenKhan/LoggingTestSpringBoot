package mak.service;

import mak.logger.annotation.LogAround;
import mak.logger.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class LoggerTestService {

    @LogAround(before = "beforeLog", after = "afterLog", argFields = {"address.city"})
    public Employee loggerTest(Employee employee) {
        return employee;
    }
}
