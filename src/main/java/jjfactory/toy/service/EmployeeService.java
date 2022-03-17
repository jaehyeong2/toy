package jjfactory.toy.service;

import jjfactory.toy.model.Employee;
import jjfactory.toy.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public void join(Employee employee){
        employeeRepository.save(employee);
    }
}
