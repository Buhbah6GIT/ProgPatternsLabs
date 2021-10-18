package Lab2_1;

/**
 * @author Anthony Nadeau
 */
public class FullTime extends Student {
    
    public FullTime(String idNum, String name) {
        super(idNum, name);
        setRegFees();
    }
    
    @Override
    public String toString() {
        return String.format("Status: Full-Time\nStudent ID Number: %s\n"
                + "Student Name: %s\nRegistration Fees: %.2f\n",   
                studentIdNum, name, regFees);
    }   
    
    @Override
    public void setRegFees() {
        regFees = 1200;
    }
    
}
