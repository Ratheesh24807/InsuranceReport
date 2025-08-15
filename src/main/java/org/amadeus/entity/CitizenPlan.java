package org.amadeus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CITIZEN_PLAN")
public class CitizenPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CITIZEN_ID",unique = true)
    public Long id;
    @Column(name= "CITIZEN_NAME")
    public String name;
    @Column(name= "CITIZEN_GENDER")
    public String gender;
    @Column(name= "CITIZEN_AGE")
    public Integer age;
    public String planName;
    public String planStatus;
    public Integer benefitAmount;
    public String denialReason;
    public LocalDate terminationDate;
    public String terminationReason;
    public LocalDate startDate;
    public LocalDate endDate;

    @Override
    public String toString() {
        return "CitizenPlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", planName='" + planName + '\'' +
                ", planStatus='" + planStatus + '\'' +
                ", benefitAmount=" + benefitAmount +
                ", denialReason='" + denialReason + '\'' +
                ", terminationDate=" + terminationDate +
                ", terminationReason='" + terminationReason + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
