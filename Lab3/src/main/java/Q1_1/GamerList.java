package Q1_1;

import java.util.*;

/**
 * @author Anthony
 */
public class GamerList {
    LinkedList<Gamer> list;
    
    public GamerList() {
        list = new LinkedList();
    }
    
    public void insert(String name, int score) {
        list.addLast(new Gamer(name, score));
        list.sort((Gamer g1, Gamer g2) -> g2.getScore() - g1.getScore());
        if (list.size() > 10)
            list.removeLast();
    }
    
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}