package com.vinz.event_driven_architecture.handler;

import com.vinz.event_driven_architecture.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordServiceHandler {
    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent patientDischargeEvent){
        System.out.println("Medical record service: Updating records for patient with patient id: "+patientDischargeEvent.getPatientId()+" "+Thread.currentThread().getName());
    }
}
//BC8233RYBC