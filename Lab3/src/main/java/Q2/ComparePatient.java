package Q2;

import java.util.*;

/**
 *
 * @author Anthony Nadeau
 */
public class ComparePatient implements Comparator<Patient> {
    
    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.isEmergencyCase() == p2.isEmergencyCase())
            return p1.getIdNumber() - p2.getIdNumber();
        else {
            if (p1.isEmergencyCase())
                return -1;
            else
                return 1;
        }
    }
}
