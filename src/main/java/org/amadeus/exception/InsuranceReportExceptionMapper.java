package org.amadeus.exception;

import jakarta.persistence.PersistenceException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class InsuranceReportExceptionMapper implements ExceptionMapper<InsuranceReportException> {


    @Override
    public Response toResponse(InsuranceReportException e) {
        ErrorResponse errorResponse = new ErrorResponse(
                e.getErrorCodeRef(),
                e.getErrorMsgRef(),
                Response.Status.NOT_FOUND.getStatusCode()
        );

        return Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).build();
    }


    public Response toResponse(PersistenceException ex) {
        ErrorResponse errorResponse = new ErrorResponse(
                ex.getMessage(),
                ex.getLocalizedMessage(),
                Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()
        );

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorResponse).build();
    }
}
