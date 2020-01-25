package br.com.babypet.utils.exceptions;

import java.util.List;

public class BadRequestException extends RuntimeException {
	
	private MessageErrorResponse errorResponse;
	
	public MessageErrorResponse getErrorResponse() {
		return this.errorResponse;
	}
	
	public BadRequestException() {
		super("Bad Resquest!!!!");
	}
	
	public BadRequestException(String message) {
		super(message);
	}
	
	public BadRequestException(List<MessageErrorDetail> errors) {
		this.errorResponse = 
				new MessageErrorResponse(
						"Erros ao salvar!!!", errors);
	}

}
