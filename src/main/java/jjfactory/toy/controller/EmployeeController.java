package jjfactory.toy.controller;

import jjfactory.toy.dto.EnrollReq;
import jjfactory.toy.model.Employee;
import jjfactory.toy.model.enums.Role;
import jjfactory.toy.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/enrollForm")
    public String enrollForm(Model model){
        model.addAttribute("enrollReq",new EnrollReq());
        return "createEmployee";
    }

    @PostMapping("/employee")
    public ResponseEntity<?> save(EnrollReq enrollReq){
        Employee employee = enrollReq.toEntity();
        employee.setRole(Role.USER);
        employeeService.join(employee);
        return new ResponseEntity<>("등록 완료", HttpStatus.OK);
    }
}
