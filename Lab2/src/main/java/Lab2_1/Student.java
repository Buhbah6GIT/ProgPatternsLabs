package Lab2_1;

/**
 * @author Anthony Nadeau
 */
public abstract class Student {
    String studentIdNum;
    String name;
    double regFees;
    
    public Student(String idNum, String name) {
        studentIdNum = idNum;
        this.name = name;
        regFees = 0;
    }
    
    @Override
    public String toString() {
        return String.format("Student ID Number: %s\nStudent Name: %s\n"
                + "Registration Fees: %f\n", studentIdNum, name, regFees);
    }

    public String getStudentIdNum() {
        return studentIdNum;
    }

    public String getName() {
        return name;
    }

    public double getRegFees() {
        return regFees;
    }

    public abstract void setRegFees();
    
    
    
}
