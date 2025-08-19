package org.amadeus.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class InsuranceReportExceptionMapper implements ExceptionMapper<InsuranceReportException> {


    @Override
    public Response toResponse(InsuranceReportException e) {
        ErrorResponse errorResponse = new ErrorResponse(
                e.getErrorCode(),
                e.getErrorMsg(),
                Response.Status.NOT_FOUND.getStatusCode(),
                e.getOutpayceError()
        );

        return Response.status(Response.Status.NOT_FOUND).entity(errorResponse).build();
    }
}
