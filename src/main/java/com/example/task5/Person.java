package com.example.task5;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
class Person {
    @NotNull(message = "Дата обязательна")
    @DateLessThenHundredYears
    LocalDate birthday;
    @NotBlank(message =  "Имя обязательно")
    @Length(max = 125, message = "Длина имени не должна превышать 125 символов")
    String name;
    @Length(max = 150, message = "Длина отчества не должна превышать 150 символов")
    String sname;
    @NotNull(message = "Пол обязателен")
    Sex sex;

    public Person(LocalDate birthday, String name, String sname, Sex sex) {
        this.birthday = birthday;
        this.name = name;
        this.sname = sname;
        this.sex = sex;
    }
}

enum Sex {
    MALE,
    FEMALE
}
