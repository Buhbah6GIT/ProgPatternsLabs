package Q1_2;

import java.util.*;

/**
 * @author Anthony
 */
public class AncientAlgorithms {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 2; i <= 100; i++) {
            list.add(i);
        }
        
        display(list);
        for (int i = 0; i < list.size(); i++) {
            Iterator<Integer> itr = list.listIterator(i + 1);
            int diviser = list.get(i);
            while (itr.hasNext()) {
                int dividend = itr.next();
                if (dividend % diviser == 0 && dividend != diviser) 
                    itr.remove();
            }
        }
        display(list);
    }
    
    public static void display(ArrayList list) {
        int itr = 0;
        for (var item : list) {
            System.out.print(item + " ");
            itr++;
            if (itr == 50)
                System.out.println();
        }
        System.out.println("\n");
    }
}
