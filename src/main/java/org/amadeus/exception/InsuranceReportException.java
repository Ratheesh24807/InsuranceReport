package org.amadeus.exception;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class InsuranceReportException extends RuntimeException{

    private final String errorCodeRef;
    private final String errorMsgRef;

    public InsuranceReportException(String errorCodeDon, String errorMsgDon){
        super(errorMsgDon);
        this.errorCodeRef=errorCodeDon;
        this.errorMsgRef=errorMsgDon;


    }



}
