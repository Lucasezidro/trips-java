package com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository

import java.utils.UUID

public interface TripRepository extends JpaRepository<Trip, UUID> {
}