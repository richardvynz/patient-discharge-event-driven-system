package com.vinz.event_driven_architecture.service;

import com.vinz.event_driven_architecture.event.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PatientDischargeService {

//    private final BillingServiceHandler billingServiceHandler;
//    private final HouseKeepingServiceHandler houseKeepingServiceHandler;
//    private final MedicalRecordServiceHandler medicalRecordServiceHandler;
//    private final NotificationServiceHandler notificationServiceHandler;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public String dischargePatient(String patientId, String patientName) {
        log.info("process discharge process initiated: {}", patientName);
//        billingServiceHandler.processBills();
//        medicalRecordServiceHandler.updatePatientHistory();
//        houseKeepingServiceHandler.cleanAndAssign();
//        notificationServiceHandler.notifyPatient();

        eventPublisher.publishEvent(new PatientDischargeEvent(this,patientId,patientName));

        log.info("patient discharge process completed: {}", patientName);

        return "patient "+ patientName+ " with ID "+patientId+" discharged Successfully";
    }
}
