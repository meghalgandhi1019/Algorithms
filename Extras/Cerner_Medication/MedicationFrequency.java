package cerner_medication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MedicationFrequency {
	final  static Map<String, Patient> patientDetails = new HashMap<String, Patient>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Patient basic details get from user and set it
		Patient p1 = new Patient();
		Calendar dob = new Calendar.Builder()
				.set(Calendar.YEAR, 1992)
				.set(Calendar.MONTH, 11)
				.set(Calendar.DAY_OF_MONTH, 19)
				.build();
		
		System.out.print("Enter First Name: ");
		p1.setFirstName(sc.next());
		
		System.out.print("Enter Last Name: ");
		p1.setLastName(sc.next());
		p1.setDob(dob);
		
		//Medication details
		
		List<Medication> medicationList = new ArrayList<Medication>();
		Medication medication  = null;
		
		String medicationType1 = "MEDICATION_FOR_SKIN";//User Entered value
		String medicationType2 = "MEDICATION_FOR_EYES";//User Entered value
		
		int moreMedicationFlag = 1;
		while(moreMedicationFlag == 1){
		
			if(medicationType1 == MedicationTypes.MEDICATION_FOR_SKIN.name()) {
				medication = new SkinMedication();
			}
		
			if(medicationType2.equals(MedicationTypes.MEDICATION_FOR_EYES) ){
				medication = new EyesMedication();
			}
			System.out.println();
			System.out.print("Enter Name of medicine: ");//can create enum of medicine name
			medication.setMedicationName(sc.next());//get from user
			medication.showSchedule();
			medicationList.add(medication);
			
			//medication2.setMedicationName("ABC");
			//medicationList.add(medication2);
			System.out.print("Enter 1 to add medication details: ");
			
			moreMedicationFlag = sc.nextInt();//Ask user to enter more medication details
			
		
		}
		
		
		p1.setMedicationList(medicationList);
	
		patientDetails.put("Patient1", p1);
		System.out.println();
		for(Map.Entry<String, Patient> p: patientDetails.entrySet()){
			System.out.println("Key: " + p.getKey());
			System.out.println(p.getValue().getFirstName() + " " + p.getValue().getLastName());
			
				List<Medication> md = p.getValue().getMedicationList();
				Iterator<Medication> it = md.iterator();
				int i= 1;
				while(it.hasNext()){
					System.out.println(i + " "+it.next().getMedicationName());
					i++;
				}
				
		}
		
	}

}
