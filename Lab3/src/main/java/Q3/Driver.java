package Q3;

import java.util.*;

/**
 * @author Anthony
 */
public class Driver {
    
    public static void main(String[] args) {
        Instructor[] arr = {new Instructor("Test", "Johnny", 111), new Instructor("Findlay", "William", 222), 
            new Instructor("Nadeau", "Anthony", 333), new Instructor("Test", "Johnny", 111)};
        Set<Instructor> set1 = new HashSet(Arrays.asList(arr));
        System.out.println(set1);
        
        Instructor inst = new Instructor("Bla", "Bla", 747);
        
        System.out.println(set1.contains(arr[1]));
        System.out.println(set1.contains(inst));
    }
}
