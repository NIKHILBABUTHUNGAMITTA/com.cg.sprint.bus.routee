package com.cg.sprint.bus.route.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.sprint.bus.route.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
	public abstract List<Route> viewBusByType(String routeType);
}
