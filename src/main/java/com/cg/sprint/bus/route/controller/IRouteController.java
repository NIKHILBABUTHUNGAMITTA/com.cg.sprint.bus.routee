package com.cg.sprint.bus.route.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.sprint.bus.route.model.Route;

public interface IRouteController {
	public ResponseEntity<Route> addRoute(Route route);
	public ResponseEntity<Route> updateRoute(Route route);
	public ResponseEntity<Route> deleteroute(int routeId);
	public ResponseEntity<Route> viewRoute(int routeId);
	@SuppressWarnings("rawtypes")
	public List viewRouteByType(String routeType);
	@SuppressWarnings("rawtypes")
	public List viewAllRoute();
}
