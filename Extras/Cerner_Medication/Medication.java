package cerner_medication;

import java.util.Calendar;
public abstract class Medication {

	private String medicationName;
	private String medicationTypes;
	private Calendar startDate;
	private Calendar startTime;
	private Calendar endDate;
	private String frequency;
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public String getMedicationTypes() {
		return medicationTypes;
	}
	public void setMedicationTypes(String medicationTypes) {
		this.medicationTypes = medicationTypes;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getStartTime() {
		return startTime;
	}
	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public abstract void showSchedule();
	
	
	
	
}
