package Q3;

import java.util.Objects;

/**
 * @author Anthony
 */
public class Instructor {
    private String lastName;
    private String firstName;
    private int officeNo;
    
    public Instructor(String lname, String fname, int offNo) {
        lastName = lname;
        firstName = fname;
        officeNo = offNo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.lastName);
        hash = 17 * hash + Objects.hashCode(this.firstName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("Instructor Info\n Last Name: %s\n First Name: %s\n"
                + "Office Number: %d\n\n", lastName, firstName, officeNo);
    }
}
