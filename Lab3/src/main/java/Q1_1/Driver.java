package Q1_1;

/**
 * @author Anthony
 */
public class Driver {
    
    public static void main(String[] args) {
        
        GamerList gList = new GamerList();
        
        gList.insert("Spike", 120);
        gList.insert("Whiz", 105);
        gList.insert("G-Man", 99);
        gList.insert("JediMaster", 95);
        gList.insert("NoobMaster69", 300);
        gList.insert("HungryBox", 155);
        gList.insert("Armada", 120);
        gList.insert("XQC", 7);
        gList.insert("Pokimane", 8);
        gList.insert("CORPSE", 85);
        gList.insert("Pewdiepie", 106);
        
        gList.display();
        
    }
}