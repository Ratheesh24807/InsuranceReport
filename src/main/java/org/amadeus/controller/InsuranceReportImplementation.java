package org.amadeus.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.Getter;
import org.amadeus.service.CitizenServ;

import java.sql.SQLException;

@Path("/insurance/report")
@ApplicationScoped
public class InsuranceReportImplementation {

    private final CitizenServ citizenServ;

    @Inject
    public InsuranceReportImplementation(CitizenServ citizenServ) {
        this.citizenServ = citizenServ;
    }


    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerDetailsByID(@PathParam("id") Long id) {

        return citizenServ.findCustomerByID(id);
    }

}
