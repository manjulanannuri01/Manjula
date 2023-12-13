package com.example.demo.Server;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DiagnosticRepository;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Repository.LaborataryRepository;
import com.example.demo.Repository.PatientRepository;
import com.example.demo.Repository.medicineRepository;
import com.example.demo.model.Diagnostic;
import com.example.demo.model.Doctor;
import com.example.demo.model.Laboratary;
import com.example.demo.model.Medicine;
import com.example.demo.model.PatientProfile;

@Service 
public class PatientServer {
	@Autowired
	PatientRepository repository;
	@Autowired
	DoctorRepository doctorRepository;
	@Autowired
	medicineRepository medicinerepository;
	@Autowired
	DiagnosticRepository diagnosticRepository;
	@Autowired
	LaborataryRepository laborataryrespository;
	
	public PatientProfile getProfile(PatientProfile profile)
	{
		return repository.save(profile);
	}
	public List<PatientProfile> getpatientdetails(){
		return repository.findAll();
	}
     public PatientProfile update(PatientProfile profile) {
	 return repository.save(profile);
	}
	
	public Doctor getdoctor(Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	public List<Doctor> getdoctordetails(){
		return doctorRepository.findAll();
	}
	public Doctor doctorupdate(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}
	
	public Medicine getmedicine(Medicine medicine)
	{
		return medicinerepository.save(medicine);
	}
	public List<Medicine> getmedicinedetails(){
		return medicinerepository.findAll();
	}
	public Medicine medicineupdate(Medicine medicine) {
		return medicinerepository.save(medicine);
	}
	
	public Diagnostic getdiagnostic(Diagnostic diagnostic)
	{
		return diagnosticRepository.save(diagnostic);
	}
	public List<Diagnostic> getdiagnosticdetails(){
		return diagnosticRepository.findAll();
	}
	public Diagnostic diagnostic(Diagnostic diagnostic) {
		return diagnosticRepository.save(diagnostic);
	}
	
	public Laboratary getlaboratary(Laboratary laboratary)
	{
		return laborataryrespository.save(laboratary);
	}
	public List<Laboratary> getlaboratarydetails(){
		return laborataryrespository.findAll();
	}
	public Laboratary updatelaboratory(Laboratary laboratory) {
	
		return laborataryrespository.save(laboratory);
	}
	
	

	

	
}
