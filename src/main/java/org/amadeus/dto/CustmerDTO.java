package org.amadeus.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.quarkus.runtime.annotations.RegisterForReflection;


import java.time.LocalDate;
@JsonInclude(JsonInclude.Include.NON_NULL)
@RegisterForReflection
public class CustmerDTO {

// we are excluding age field here
    public Long id;
    public String name;
    public String gender;
    public String planName;
    public String planStatus;
    public Integer benefitAmount;
    public String denialReason;
    public LocalDate terminationDate;
    public String terminationReason;
    public LocalDate startDate;
    public LocalDate endDate;

}
