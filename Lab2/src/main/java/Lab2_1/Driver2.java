package Lab2_1;

/**
 * @author Anthony Nadeau
 */
public class Driver2 {
    
    public static void main(String[] args) {
        
        // Creating Student objects
        FullTime fts1 = new FullTime("2058983", "Anthony Nadeau");
        PartTime pts1 = new PartTime("1234567", "Giuliana Bouzon");
        FullTime fts2 = new FullTime("7654321", "Shahe Bannis");
        PartTime pts2 = new PartTime("1357911", "Christina Kallas");
        
        // Printing two students to test that everything works
        System.out.println("Printing first two student objects directly: ");
        System.out.println(fts1);
        System.out.println(pts1);
       
        // Creating LinkedList and adding objects
        MyLinkedList list = new MyLinkedList();
        list.addLast(fts1);
        list.addLast(pts1);
        list.addLast(fts2);
        list.addLast(pts2);
        
        // Calling Display method 
        System.out.println("Printing the Linked List of students using loop: ");
        display(list);
        
        // Adding a new student
        System.out.println("Adding new PartTime Student: ");
        PartTime pts3 = new PartTime("1122334", "Kerian Loerick");
        list.addFirst(pts3);
        display(list);
        
        // Removing last student
        System.out.println("Removing last student from the list: ");
        list.removeLast();
        display(list);
        
        // Adding an object and removing an object
        System.out.println("Adding an object to idx 2 and removing the object at idx 1: ");
        PartTime pts4 = new PartTime("0099887", "Armen Jabamikos");
        list.add(2, pts4);
        list.remove(1);
        display(list);
      
        // Verifying if the object is in the list and returning index
        System.out.println("Checking if the object is contained in the list and displaying the index: ");
        System.out.println("Object is in the list: " + list.contains(pts4));
        System.out.println("Index of said object is: " + list.indexOf(pts4));
        System.out.println();
        
        // Using set method to change a name
        System.out.println("Changing name from Armen Jabamikos to John Doe: ");
        list.set(new PartTime("0099887", "John Doe"), 1);
        display(list);
        
        // Putting the students into an array
        System.out.println("Printing the array: ");
        Student[] students = {fts1, pts1, fts2, pts2, pts3, pts4};
        MyLinkedList list2 = new MyLinkedList(students);
        display(list2);
    }
    
    /**
     * Display methods eliminates the need to write the for loop to print 
     * the list multiple times
     * @param list MyLinkedList object being printed
     */
    public static void display(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
