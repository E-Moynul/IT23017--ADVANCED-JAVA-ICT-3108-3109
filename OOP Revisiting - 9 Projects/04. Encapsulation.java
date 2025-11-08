//it23017
class SmartThermostat {
    
    private int temperature;

    public void setTemperature(int newTemp) {
        if (newTemp >= 50 && newTemp <= 85) {
            this.temperature = newTemp;
            System.out.println("Temperature set to: " + newTemp);
        } else {
            System.out.println("Error: Cannot set temperature to " + newTemp + 
                               ". Must be between 50 and 85.");
        }
    }

    public int getTemperature() {
        return this.temperature;
    }
}

public class Home {
    public static void main(String[] args) {
        SmartThermostat stat = new SmartThermostat();
        
        stat.setTemperature(68);
        
        stat.setTemperature(100);
        
        System.out.println("Current thermostat setting is: " + stat.getTemperature());
    }
}
