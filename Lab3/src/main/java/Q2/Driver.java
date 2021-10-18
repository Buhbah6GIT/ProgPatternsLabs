package Q2;

import java.util.*;

/**
 * @author Anthony Nadeau
 */
public class Driver {
    
    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(10, new ComparePatient());
        
        patientQueue.add(new Patient(1, "Patient1", false));
        patientQueue.add(new Patient(2, "Patient2", false));
        patientQueue.add(new Patient(3, "Patient3", true));
        patientQueue.add(new Patient(4, "Patient4", false));
        patientQueue.add(new Patient(5, "Patient5", true));
        
        PriorityQueue<Patient> patientQueue1 = new PriorityQueue<>(10, new ComparePatient());
        
        patientQueue1.add(new Patient(1, "Patient1", false));
        patientQueue1.add(new Patient(2, "Patient2", false));
        patientQueue1.add(new Patient(5, "Patient5", true));
        patientQueue1.add(new Patient(4, "Patient4", false));
        patientQueue1.add(new Patient(3, "Patient3", true));
        
        display(patientQueue);
        display(patientQueue1);
    }
    public static void display(PriorityQueue<Patient> queue) {
        System.out.print("Doctor's waiting for patients: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll().getName() + " ");
        }
        System.out.println();
    }
}
