package com.cg.sprint.bus.route.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	@ExceptionHandler(RouteAlreadyExistsException.class)
	public ResponseEntity<Object> handleRouteAlreadyExistsException(){
		LOG.info("handleRouteAlreadyExistsException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The route already exists in the database");
		return new ResponseEntity<Object>(null, headers, HttpStatus.METHOD_NOT_ALLOWED); 
	}
	
	@ExceptionHandler(RouteNotFoundException.class)
	public ResponseEntity<Object> RouteNotFoundException(){
		LOG.info("handleRouteNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Route you are updating does not exist in database");
		return new ResponseEntity<Object>(null, headers, HttpStatus.METHOD_NOT_ALLOWED); 
	}
}
