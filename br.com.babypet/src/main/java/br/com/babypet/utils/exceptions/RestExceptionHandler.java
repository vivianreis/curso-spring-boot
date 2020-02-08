package br.com.babypet.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> handlerNotFoundException(NotFoundException exception) {
		String message = exception.getMessage();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<?> handlerBadRequestException(
			BadRequestException exception){
		
		String message = exception.getMessage();
		MessageErrorResponse errorResponse = exception.getErrorResponse();
		
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
		        .body(errorResponse);
	}
	
	@ExceptionHandler(NoContentException.class)
	public ResponseEntity<?> handleNoContentEsception(
			NoContentException exception){
		return ResponseEntity
				.status(HttpStatus.NO_CONTENT)
		        .build();
	}

}
