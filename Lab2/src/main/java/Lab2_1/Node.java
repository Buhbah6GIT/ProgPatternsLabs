package Lab2_1;

/**
 * @author Anthony Nadeau
 */
public class Node<E> {
    E element;
    Node<E> next;
    
    public Node(E type) {
        element = type;
    }
}
