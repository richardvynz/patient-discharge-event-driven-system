package com.vinz.event_driven_architecture.handler;

import com.vinz.event_driven_architecture.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @Async
    @EventListener
    public void processBills(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Processing bill for patient with patient Id: "+ patientDischargeEvent.getPatientId() +" "+ Thread.currentThread().getName());
    }
}
