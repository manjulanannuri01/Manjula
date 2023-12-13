package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Server.PatientServer;
import com.example.demo.model.Diagnostic;
import com.example.demo.model.Doctor;
import com.example.demo.model.Laboratary;
import com.example.demo.model.Medicine;
import com.example.demo.model.PatientProfile;

@RestController
public class PatientController {
	@Autowired
	PatientServer server;

	@PostMapping("/patientprofile")
	public PatientProfile registration(@RequestBody PatientProfile profile) {
		return server.getProfile(profile);
	}
	
	@GetMapping("/patientdetails")
	public List<PatientProfile>getDetails(){
		return server.getpatientdetails();	
	}
	@PutMapping("/update")
	public PatientProfile updatedetails(@RequestBody PatientProfile profile)
	{
		return server.update(profile);
	}
	
	@PostMapping("/doctordetails")
	public Doctor doctordetails(@RequestBody Doctor doctor) {
		return server.getdoctor(doctor);
	}
	@GetMapping("/getdetails")
	public List<Doctor>getdoctor(){
		return server.getdoctordetails();
	}
	@PutMapping("/update1")
	public Doctor update(@RequestBody Doctor doctor)
	{
		return server.doctorupdate(doctor);
	}
	
	@PostMapping("/medicinesave")
	public Medicine medicinedetails(@RequestBody Medicine medicine) {
		return server.getmedicine(medicine);
	}
	@GetMapping("/getmedicine")
	public List<Medicine>getmedicine(){
		return server.getmedicinedetails();
	}
	@PutMapping("/medicineupdate")
	public Medicine updatemedicine(@RequestBody Medicine medicine )
	{
		return server.medicineupdate(medicine);
	}
	
	@PostMapping("/diagnostic")
	public Diagnostic diagnosticdetails(@RequestBody Diagnostic diagnostic) {
		return server.getdiagnostic(diagnostic);
	}
	@GetMapping("/getdiagnostic")
	public List<Diagnostic>getdiagnostic(){
		return server.getdiagnosticdetails();
	}
	@PutMapping("/updatediagnostic")
	public Diagnostic updatediagnostic(@RequestBody Diagnostic diagnostic)
	{
		return server.diagnostic(diagnostic);
	}
	
	@PostMapping("/laboratary")
	public Laboratary laboratarydetails(@RequestBody Laboratary laboratary) {
		return server.getlaboratary(laboratary);
	}
	@GetMapping("/getlaboratary")
	public List<Laboratary> getlaboratary(){
		return server.getlaboratarydetails();
	}
	@PutMapping("/laboratoryupdate")
	public Laboratary updatemobileid(@RequestBody Laboratary laboratory )
	{
		return server.updatelaboratory(laboratory);
	}
}
