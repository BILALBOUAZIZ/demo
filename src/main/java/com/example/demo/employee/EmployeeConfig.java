package com.example.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunnerEmployee(EmployeeRepository repository){
        return  args -> {
           Employee bilal = new Employee(
                    "bilal",
                    "aitbouaziz",
                    "bilalaitbouaziz@gmail.com",
                    "06666666",
                    "1.2332.12",
                    "IT",
                    "..",
                    10000,
                    LocalDate.of(2023, Month.JANUARY, 5)
            );
            repository.saveAll(
                    List.of(bilal)
            );

        };
    }

}
