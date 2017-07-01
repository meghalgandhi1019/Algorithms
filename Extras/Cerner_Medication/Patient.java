package cerner_medication;

import java.util.Calendar;
import java.util.List;

public class Patient implements AllPatients{

	//Encapsulation
	private String firstName;
	private String lastName;
	private Calendar dob;
	private List<Medication> medicationList;
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	public List<Medication> getMedicationList() {
		return medicationList;
	}
	public void setMedicationList(List<Medication> medicationList) {
		this.medicationList = medicationList;
	}
	
	
}
