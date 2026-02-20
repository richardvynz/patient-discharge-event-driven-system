package com.vinz.event_driven_architecture.handler;

import com.vinz.event_driven_architecture.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingServiceHandler {
    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("House Keeping service: preparing room for" +
                " next patient after discharge of patient with patient id: "+
                patientDischargeEvent.getPatientId()+" "+Thread.currentThread().getName());
    }
}
