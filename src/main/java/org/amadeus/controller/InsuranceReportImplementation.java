package org.amadeus.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.amadeus.service.CitizenServ;

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
