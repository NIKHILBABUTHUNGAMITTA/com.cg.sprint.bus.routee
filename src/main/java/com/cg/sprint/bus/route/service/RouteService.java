package com.cg.sprint.bus.route.service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.sprint.bus.route.model.Route;
import com.cg.sprint.bus.route.repository.RouteRepository;
import com.cg.sprint.bus.route.exception.RouteAlreadyExistsException;
import com.cg.sprint.bus.route.exception.RouteNotFoundException;

public class RouteService implements IRouteService{
	private static final Logger LOG = LoggerFactory.getLogger(RouteService.class);
	@Autowired
	private RouteRepository routeRepository;

	@Override
	public Route addRoute(Route route) {
		LOG.info("RouteService addRoute");
		if(routeRepository.existsById(route.getRouteId())) {
			LOG.info("Route already exists");
			throw new RouteAlreadyExistsException("Route with " + route.getRouteId() + " as id already exists");
		}
		else {
			LOG.info("Route added");
			return routeRepository.save(route);
		}
	
	}
	@Override
	public Route updateRoute(Route route) {
		LOG.info("RouteService addRoute");
		if(routeRepository.existsById(route.getRouteId())) {
			LOG.info("Route exists and will be updated");
			return routeRepository.save(route);
		}
		else {
			LOG.info("Route does not exist");
			throw new RouteNotFoundException("Route with " + route.getRouteId() + "as Id does not exist");
		}
	}
	@Override
	public Route deleteRoute(int routeId) {
		LOG.info("RouteService addRoute");
		if(routeRepository.existsById(routeId)) {
			LOG.info("Route will be deleted");
			routeRepository.deleteById(routeId);
			return null;
		}
		else {
			LOG.info("Route does not exist");
			throw new RouteNotFoundException("Route with " + routeId + " does not exist");
		}
	}

	@Override
	public Route viewRoute(int routeId) {
		LOG.info("RouteService addRoute");
		if(routeRepository.existsById(routeId)) {
			LOG.info("Viewing bus");
			return routeRepository.getById(routeId);
		}
		else {
			LOG.info("Route does not exist");
			throw new RouteNotFoundException("Route with " + routeId + " does not exist");
		}
	}
	@Override
	public List<Route> viewBusByType(String routeType) {
		LOG.info("viewRouteByType Service");
		return routeRepository.viewBusByType(routeType);
	}

	@Override
	public List<Route> viewAllRoute() {
		LOG.info("Viewing all routes");
		return routeRepository.findAll();
	}
	
}
