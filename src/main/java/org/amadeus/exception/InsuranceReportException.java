package org.amadeus.exception;

import lombok.Getter;

@Getter
public class InsuranceReportException extends RuntimeException{

    private final String errorCode;
    private final String errorMsg;
    private final String outpayceError;

    public InsuranceReportException(String errorCodeDon, String errorMsgDon, String outpayceError){
        super(errorMsgDon);
        this.errorCode =errorCodeDon;
        this.errorMsg =errorMsgDon;
        this.outpayceError = outpayceError;
    }

    public InsuranceReportException(String err, String errmsg){
        this.outpayceError=null;
        this.errorCode=err;
        this.errorMsg=errmsg;
    }

}
