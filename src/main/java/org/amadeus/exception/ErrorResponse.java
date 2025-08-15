package org.amadeus.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ErrorResponse {

    private String errorCodeDone;
    private String errorMessageDone;
    private int errorStatusCode;





}
