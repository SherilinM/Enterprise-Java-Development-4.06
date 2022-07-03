package service.impl;

import model.Patient;
import repository.PatientRepository;
import service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class PatientService implements IPatientService {

    @Autowired
    private PatientRepository patientRepository;

    //crear ruta nuevo paciente
    public Patient addNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    //crear ruta actualizar informacion del paciente
    public void updateAnyPatientInformation(Integer patientId, Patient patient){
        if (patientRepository.findById(patientId).isPresent()){
            patient.setPatientId(patientId);
            patientRepository.save(patient);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }
}