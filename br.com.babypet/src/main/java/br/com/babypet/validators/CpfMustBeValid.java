package br.com.babypet.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CpfMustBeValidValidator.class)
public @interface CpfMustBeValid {

	public String message() default "CPF inválido";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
