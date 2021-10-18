package Lab2_1;

/**
 * @author Anthony
 */
public class Driver {
    
    public static void main(String[] args) {
        MyLinkedList<String> list1 = new MyLinkedList();
        
        list1.addFirst("Vanier");
        list1.addFirst("College");
        
        list1.addLast("Vanier");
        list1.addLast("College");
        
        display(list1);
        System.out.println("The size is: "+ list1.size());
        System.out.println("Linked list is empty: " + list1.isEmpty());
        list1.clear();
        System.out.println("Now it's Empty: " + list1.isEmpty());
        
        Integer[] listArr = {4, 7, 9, 2, 0, -3};
        
        MyLinkedList<Integer> list2 = new MyLinkedList(listArr);
        System.out.println("A Linked list from an array: ");
        display(list2);
        
        System.out.println("The first of my list is: " + list2.getFirst());
        System.out.println("The last of my list is: " + list2.getLast());
        
        list2.removeFirst();
        list2.removeLast();
        System.out.println("The new first of my list is: " + list2.getFirst());
        System.out.println("The new last of my list is: " + list2.getLast());
        
        System.out.println("The list contains 4: " + list2.contains(4));
        System.out.println("The list contains 9: " + list2.contains(9));
        
        System.out.println("The index of 2 is: " + list2.indexOf(2));
        System.out.println("The index of 4 is: " + list2.indexOf(4));
        
        list2.set(9, 3);
        display(list2);
        
        list2.add(2, 3);
        display(list2);
        
        list2.remove(2);
        display(list2);
    }
    
   public static void display(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "");
        }
        System.out.println();
   }
}
