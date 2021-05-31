package com.example.task5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateValidator implements ConstraintValidator<DateLessThenHundredYears, LocalDate> {
    public void initialize(DateLessThenHundredYears constraint) {
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        var dateNow = LocalDate.now();
        return value.isBefore(dateNow) && value.isAfter(dateNow.minusYears(100));
    }
}