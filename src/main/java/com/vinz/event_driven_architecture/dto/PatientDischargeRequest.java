package com.vinz.event_driven_architecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PatientDischargeRequest {
    private String patientId;
    private String patientName;
}
