package Lab2_1;

/**
 * @author Anthony Nadeau
 */
public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public MyLinkedList(E[] array) {
        for (E element: array) {
            addLast(element);
        }
    }
    
    public void addFirst(E e) {
        Node<E> newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) 
            tail = head;
    }
    
    public void addLast(E e) {
        if (tail == null) {
          head = tail = new Node<>(e);
        }
        else {
          tail.next = new Node<>(e);
          tail = tail.next;
        }
        size++;
    }

    
    public E getFirst() {
        if (isEmpty()) 
            throw new IndexOutOfBoundsException();
        else
            return head.element;
    }
    
    public E getLast() {
        if (isEmpty()) 
            throw new IndexOutOfBoundsException();
        else
            return tail.element;
    }
    
    public E removeFirst() {
        E element = head.element;
        if (size >= 1) {
            head = head.next;
            size--;
            if (head == null) tail = null;
            return element;
        }
        else {
            throw new IndexOutOfBoundsException();
        }   
    }
    
    public E removeLast() {
        Node<E> current = head;
        Node<E> temp = null;
        if (size >= 1) {
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }       
            temp = tail;
            tail = current;
            tail.next = null;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
        size--;
        return temp.element;
    }
    
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public boolean contains(E object) {
        return indexOf(object) >= 0;
    }
    
    @Override
    public int indexOf(E object) {
        Node<E> current = head;
        for (int i = 0; i < size - 1; i++) {
            if (object.equals(current.element))
                    return i;
            else {
                current = current.next;
            }
        }
        return -1;
    }
    
    @Override
    public E get(int index){
        if ((size!=0) && (index<=size-1)&&(index>=0)) {
            int i=0;
            Node<E> current=head;   
            while(i<index) { current=current.next;  i++; }
             return current.element;
          }
          else throw new IndexOutOfBoundsException();  
    }
    
    @Override
    public void set (E object, int index) {
        if ((size!=0) && (index<=size-1)&&(index>=0)) {
            int i=0;
            Node<E> current=head;   
            while(i<index) { 
                current=current.next;  i++; 
            }
            current.element = object;
          }
          else throw new IndexOutOfBoundsException(); 
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public  void add(int index, E object) {
        if (index <= 0)
            addFirst(object);
        else if (index >= size)
            addLast(object);
        else {
            Node<E> current = head;
            for (int i = 0; i < index -1; i++) 
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<E>(object);
            (current.next).next = temp;
            size++;
        }
    }
    
    @Override
    public  E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        else if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        Node<E> current = head;
        for (int i = 0; i < index -1; i++) 
            current = current.next;
        Node<E> temp = current.next;
        current.next = current.next.next;
        size--;
        return temp.element;
    }
}
