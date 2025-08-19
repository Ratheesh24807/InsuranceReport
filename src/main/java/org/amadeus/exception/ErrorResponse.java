package org.amadeus.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL) // ignore null fields in JSON response
public class ErrorResponse {

    /* This fields will be displayed in response
      as these fields are set in InsuranceReportException class

     */
    private String errorCode;
    private String errorMessage;
    private int errorStatusCode;
    private String outpayceError;





}
