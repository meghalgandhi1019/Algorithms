package cerner_Temperature;

public class Temperature {
	private String tempType;
	private double temperature;
	private String tempTakenFrom;
	private double result;

	//Getters and Setters

	public void setTempType(String tempType){
		this.tempType = tempType;
	}

	public String getTempType(){
		return tempType;
	}

	public void setTemperature(double temperature){
		this.temperature = temperature;
	}
	public double getTemperature(){
		return temperature;
	}

	public void setTempTakenFrom(String tempTakenFrom){
		this.tempTakenFrom = tempTakenFrom;
	}
	public String getTempTakenFrom(){
		return tempTakenFrom;
	}


	//If temperature is in CELCIUS then these methods will be used 
	public double convertCtoF (double temperature) {
		 
		return temperature;
	} 
	public double convertCtoK (double temperature) {
		return temperature;
	} 

	//If temperature is in FAHRENHEIT then these methods will be used 
	public double convertFtoC (double temperature) {
		return temperature;
	} 
	public double convertFtoK (double temperature) {
		return temperature;
	} 

	//If temperature is in KELVIN then these methods will be used 
	public double convertKtoC (double temperature) {
		return result;
	} 
	public double convertKtoF (double temperature) {
		return result;
	} 


	

}
