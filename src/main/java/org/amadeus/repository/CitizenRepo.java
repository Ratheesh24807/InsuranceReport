package org.amadeus.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.amadeus.entity.CitizenPlan;

@ApplicationScoped
public class CitizenRepo implements PanacheRepository<CitizenPlan> {
}
