package com.vinz.event_driven_architecture.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Setter
@Getter
public class PatientDischargeEvent extends ApplicationEvent {

    private String  patientId;
    private String patientName;

    public PatientDischargeEvent(Object source, String patientId, String patientName) {
        super(source);
        this.patientName = patientName;
        this.patientId = patientId;
    }
}
