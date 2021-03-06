package com.example.crudspringreactjs;

import com.example.crudspringreactjs.model.Employee;
import com.example.crudspringreactjs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringReactjsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringReactjsApplication.class, args);
    }
}
