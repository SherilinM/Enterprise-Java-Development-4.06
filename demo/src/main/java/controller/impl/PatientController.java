package controller.impl;

import controller.interfaces.IPatientController;
import model.Patient;
import service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PatientController implements IPatientController {

    @Autowired
    private IPatientService patientService;

    //crear nuevo paciente
    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient addNewPatient(@RequestBody @Valid Patient patient) {
        return patientService.addNewPatient(patient);
    }

    //actualizar la informacion del paciente
    @PutMapping("/patient-update/{patientId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAnyPatientInformation(@PathVariable Integer patientId, @RequestBody @Valid Patient patient) {
        patientService.updateAnyPatientInformation(patientId, patient);
    }
}
