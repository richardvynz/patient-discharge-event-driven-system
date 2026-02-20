package com.vinz.event_driven_architecture.controller;


import com.vinz.event_driven_architecture.dto.PatientDischargeRequest;
import com.vinz.event_driven_architecture.service.PatientDischargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class DischargeProcessorController {
    private final PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest request){
        return patientDischargeService.dischargePatient(request.getPatientId(),request.getPatientName());
    }

}
