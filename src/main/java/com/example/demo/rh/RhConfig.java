package com.example.demo.rh;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class RhConfig {
    @Bean
    CommandLineRunner commandLineRunnerRh(RhRepository repository){
        return  args -> {
            RhRes amine = new RhRes(
                    "amine",
                    "aitbouaziz",
                    "amineaitbouaziz@gmail.com",
                    "06656666",
                    "1.2332.12",
                    "RH",
                    "RH",
                    15000,
                    LocalDate.of(2020, Month.JANUARY, 5)
            );
            repository.saveAll(List.of(amine));

        };
    }


}
