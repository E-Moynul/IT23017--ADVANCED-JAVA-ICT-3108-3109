//it23017
class Vehicle {

    public String publicMake;
    protected String protectedModel;
    String defaultYear;
    private String privateVin;

    public Vehicle() {
        this.publicMake = "Ford";
        this.protectedModel = "Mustang";
        this.defaultYear = "2023";
        this.privateVin = "XYZ123ABC";
    }

    public String getPrivateVin() {
        return this.privateVin;
    }
    
    private void privateInternalCheck() {
        System.out.println("Running private internal check.");
    }
    
    void defaultFuelCheck() {
        System.out.println("Running default fuel check.");
    }

    protected void protectedEngineStart() {
        System.out.println("Running protected engine start.");
        privateInternalCheck();
    }

    public void publicHonk() {
        System.out.println("Running public honk.");
    }
}

class Car extends Vehicle {

    public void showAccess() {
        System.out.println("--- Access from Child Class ---");

        System.out.println(publicMake);

        System.out.println(protectedModel);

        System.out.println(defaultYear);

        // System.out.println(privateVin); // This would be a COMPILE ERROR
        
        System.out.println(getPrivateVin());
        
        publicHonk();
        protectedEngineStart();
        defaultFuelCheck();
        // privateInternalCheck(); // This would be a COMPILE ERROR
    }
}

public class Garage {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        
        System.out.println("--- Access from Main (Same Package) ---");

        System.out.println(myVehicle.publicMake);

        System.out.println(myVehicle.protectedModel);

        System.out.println(myVehicle.defaultYear);

        // System.out.println(myVehicle.privateVin); // This would be a COMPILE ERROR

        System.out.println(myVehicle.getPrivateVin());

        myVehicle.publicHonk();
        myVehicle.protectedEngineStart();
        myVehicle.defaultFuelCheck();
        // myVehicle.privateInternalCheck(); // This would be a COMPILE ERROR
        
        System.out.println();
        
        Car myCar = new Car();
        myCar.showAccess();
    }
}
