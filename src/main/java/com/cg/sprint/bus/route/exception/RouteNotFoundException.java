package com.cg.sprint.bus.route.exception;

@SuppressWarnings("serial")
public class RouteNotFoundException extends RuntimeException{
	public RouteNotFoundException() {
		super();
	}
	public RouteNotFoundException(String s) {
		super(s);
	}
}
