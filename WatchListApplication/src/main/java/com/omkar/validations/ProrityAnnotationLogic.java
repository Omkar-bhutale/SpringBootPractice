package com.omkar.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProrityAnnotationLogic implements ConstraintValidator<Priority, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.trim().length()==1&& "LHM".contains(value.trim());
	}

}
