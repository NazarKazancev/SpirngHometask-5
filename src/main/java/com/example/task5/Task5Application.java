package com.example.task5;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import javax.validation.*;
import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class Task5Application  implements CommandLineRunner {

    public static void main(String[] args) {
        var app = new SpringApplication(Task5Application.class);
        app.run(args);
    }

    @Override
    public void run(String[] args) {
     }
}
