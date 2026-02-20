package com.vinz.event_driven_architecture.handler;

import com.vinz.event_driven_architecture.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceHandler {
    @Async
    @EventListener
    public void notifyPatient(PatientDischargeEvent patientDischargeEvent){
        System.out.println("Notification Service: sending discharge notification for patient with patient id: "+patientDischargeEvent.getPatientId()+" "+Thread.currentThread().getName());
    }
}
