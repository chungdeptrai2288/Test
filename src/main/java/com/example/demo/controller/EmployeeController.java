package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/app/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    //getALL
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // insert
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    //detail
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable  long id){
        Employee employee =employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id : "+id));
        return  ResponseEntity.ok(employee);
    }
    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable  long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id : "+id));
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    //update
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id ,@RequestBody Employee employeeDetail){
        Employee updateEmployee =employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist with id : "+id));
        updateEmployee.setFirstName(employeeDetail.getFirstName());
        updateEmployee.setLastName(employeeDetail.getLastName());
        updateEmployee.setEmailId(employeeDetail.getEmailId());
        employeeRepository.save(updateEmployee);
        return  ResponseEntity.ok(updateEmployee);
    }
}
