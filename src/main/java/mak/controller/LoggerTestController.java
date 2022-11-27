package mak.controller;

import mak.logger.model.Employee;
import mak.service.LoggerTestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logger")
public class LoggerTestController {

    LoggerTestService service;

    LoggerTestController(LoggerTestService service) {
        this.service = service;
    }

    @PostMapping
    public Employee loggerTest(@RequestBody Employee employee) {
        return service.loggerTest(employee);
    }

}
