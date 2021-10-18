package Q2;

/**
 * @author Anthony
 */
public class Patient {
    private int idNumber;
    private String name;
    private boolean emergencyCase;
    
    public Patient(int id, String name, boolean emergency) {
        idNumber = id;
        this.name = name;
        emergencyCase = emergency;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public boolean isEmergencyCase() {
        return emergencyCase;
    }
}
