package org.amadeus.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.amadeus.entity.CitizenPlan;
import org.amadeus.exception.ErrorListInternal;
import org.amadeus.exception.InsuranceReportException;
import org.amadeus.repository.CitizenRepo;

import java.sql.SQLException;

import static org.amadeus.constants.InsuranceReportGenerationConstants.INTERNAL_SERVER_ERROR;
import static org.amadeus.constants.InsuranceReportGenerationConstants.INVALID_DATA;

@ApplicationScoped
@Slf4j
public class CitizenServ {

    private final CitizenRepo citizenRepo;

    @Inject
    public CitizenServ(CitizenRepo citizenRepo) {
        this.citizenRepo = citizenRepo;
    }

    @Transactional
    public Response findCustomerByID(long id){
        try {
            CitizenPlan planDetails = citizenRepo.findById(id);


            if (planDetails == null) {
                throw new InsuranceReportException(INVALID_DATA, ErrorListInternal.INVALID_USER_ID.toError());
            }
            log.info("Searching for CitizenPlan with ID: {}", id);

            return Response.status(Response.Status.OK).entity(planDetails).build();

        } catch (PersistenceException exception) {
            throw new PersistenceException(INTERNAL_SERVER_ERROR, exception.getCause());
        }
    }

    public Response findCustomerByName(String name) {

        return Response.status(Response.Status.OK).build();
    }

    public Response findCustomerByGender(String gender) {

        return Response.status(Response.Status.OK).build();
    }

    public Response findCustomerByPlanName(String planName) {

        return Response.status(Response.Status.OK).build();
    }

    public Response findCustomerByStatus(String planStatus) {

        return Response.status(Response.Status.OK).build();
    }


}
