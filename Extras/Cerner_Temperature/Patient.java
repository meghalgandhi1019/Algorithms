package cerner_Temperature;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Patient {

	private String firstName;
	private String lastName;
	private Date dob;
    private String gender;
	private List<String> medicalHistory;
	private String address;
	private String country;
	private String pincode;
	private HashSet<String> symptoms;  //Optional
	private List<Temperature> hourlyTemp;
	double patientNormalTemp;
	
	public double getPatientNormalTemp() {
		return patientNormalTemp;
	}
	public void setPatientNormalTemp(double patientNormalTemp) {
		this.patientNormalTemp = patientNormalTemp;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(List<String> medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public HashSet<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(HashSet<String> symptoms) {
		this.symptoms = symptoms;
	}
	public List<Temperature> getHourlyTemp() {
		return hourlyTemp;
	}
	public void setHourlyTemp(List<Temperature> hourlyTemp) {
		this.hourlyTemp = hourlyTemp;
	}
	
}
	
	//this method only takes Fahrenheit temp
	//Public boolean isFever(double temperature, String tempType, String tempTakenFrom)
	/*public boolean isFever(List<Temperature> temperatures){
		Iterator<Temperature> it = temperatures.iterator();
		while(it.hasNext()){
			Temperature t = it.next();
			//Also consider the difference between two successive temp >1
			//	if  (t.getTempTakenFrom().equals(TemperatureTakenFrom.ARMPIT) && (t.getTemperature() -  normalTemp) >= 2 ){
					//take avg
				}
			//	else if  (t.getTemperature() > normalTemp && (t.getTemperature() -  normalTemp) >=2 && t.getTempTakenFrom().equals(TemperatureTakenFrom.MOUTH)){
					//take avg
				}
				//else if  (t.getTemperature() > normalTemp && (t.getTemperature() -  normalTemp) >=2 && t.getTempTakenFrom().equals(TemperatureTakenFrom.EAR)){
					//take avg
				//}

	//	}
	} 

	
//Avg is greater than min and less than max. 

//}




//Random normalTemp = new Random(); 
		//double temp  = normalTemp.nextInt(40 - 30) + 30;
		/*If (temperature .getTempType == TemperatureTypes.CELCIUS){
		normalTemp = 37;
	}
	If (temperature .getTempType == TemperatureTypes.FAHRENHEIT){
		normalTemp = 98.6;
	}
	If (temperature .getTempType == TemperatureTypes.KELVIN){
		normalTemp = 310.15;
	} */

		/*Iterator<Temperature> it = temperatures.iterator();
		while(it.hasNext()){
			Temperature t = it.next();
			//Also consider the difference between two successive temp >1
				if  (t.getTemperature() > normalTemp && (t.getTemperature() -  normalTemp) >= 2 && t.getTempTakenFrom().equals(TemperatureTakenFrom.ARMPIT)){
					//take avg
				}
				else if  (t.getTemperature() > normalTemp && (t.getTemperature() -  normalTemp) >=2 && t.getTempTakenFrom().equals(TemperatureTakenFrom.MOUTH)){
					//take avg
				}
				else if  (t.getTemperature() > normalTemp && (t.getTemperature() -  normalTemp) >=2 && t.getTempTakenFrom().equals(TemperatureTakenFrom.EAR)){
					//take avg
				}*/

		//}
