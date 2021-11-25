package com.cg.sprint.bus.route.exception;
public class RouteAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RouteAlreadyExistsException() {
		super();
	}
	public RouteAlreadyExistsException(String s) {
		super(s);
	}
}