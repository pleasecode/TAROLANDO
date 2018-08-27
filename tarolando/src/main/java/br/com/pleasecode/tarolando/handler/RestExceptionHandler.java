package br.com.pleasecode.tarolando.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.pleasecode.tarolando.error.ResourceNotFoundException;
import br.com.pleasecode.tarolando.error.ResourceNotFoundExceptionDetails;
import br.com.pleasecode.tarolando.error.ValidationErrorDetails;

@ControllerAdvice // permite utilizar esta classe atraves das camadas oferecidas pelo framework SPRING
public class RestExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnFoundException) {
		ResourceNotFoundExceptionDetails rnFoundExceptionDetails =  ResourceNotFoundExceptionDetails.Builder
		.newBuilder()
		.momento(new Date().getTime())
		.titulo("Recurso não encontrado")
		.status(HttpStatus.NOT_FOUND.value())
		.detalhes(rnFoundException.getMessage())
		.classError((rnFoundException.getClass().getName()))
		.build();
		
		return new ResponseEntity<>(rnFoundExceptionDetails, HttpStatus.NOT_FOUND);
	}

}
