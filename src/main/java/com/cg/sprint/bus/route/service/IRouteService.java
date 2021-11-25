package com.cg.sprint.bus.route.service;

import java.util.List;

import com.cg.sprint.bus.route.model.Route;

public interface IRouteService {

	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	public Route deleteRoute(int routeId);
	public Route viewRoute(int routeId);
	public List<Route> viewAllRoute();
	public List<Route> viewBusByType(String routeType);
}