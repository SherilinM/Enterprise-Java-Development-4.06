package service.interfaces;

import model.Patient;

public interface IPatientService {

    //crear ruta agregar nuevo paciente
    public Patient addNewPatient(Patient patient);

    //crear la informacion del paciente
    public void updateAnyPatientInformation(Integer patientId, Patient patient);
}
