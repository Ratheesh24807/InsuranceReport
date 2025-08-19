package org.amadeus.mapper;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.amadeus.dto.CustmerDTO;
import org.amadeus.entity.CitizenPlan;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.time.LocalDate;

@Mapper(componentModel = "jakarta")
public interface CitizenDetails {


   @BeanMapping(ignoreByDefault = true) // this will set all fields to Null by default
   @Mapping(target = "name",  source = "name")
   @Mapping(target = "id",  source = "id")
   @Mapping(target = "gender",  source = "gender")
   @Mapping(target = "planName",  source = "planName")
   @Mapping(target = "planStatus",  source = "planStatus")
   @Mapping(target = "benefitAmount",  source = "benefitAmount")
   @Mapping(target = "denialReason",  source = "denialReason")
   @Mapping(target = "terminationDate",  source = "terminationDate")
    CustmerDTO toCitizenDetails(CitizenPlan entity);


   @Mapping(target = "name",  source = "name")
   @Mapping(target = "id",  source = "id")
   void toCitizenUpdate(@MappingTarget CustmerDTO cusDto,CitizenPlan citiPlan);

}

/*
public String terminationReason;
public LocalDate startDate;
public LocalDate endDate;

 */