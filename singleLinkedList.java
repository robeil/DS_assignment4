package DS_assignment4;

public class singleLinkedList<E> {

    //data fields
    private Node<E> head = null;
    private int size = 0;

    //Node inner class
    private static class Node<E> {
        //data fields
        private E data;
        private Node<E> next;

        private Node(E item) {
            this.data = item;
            this.next = null;
        }

        private Node(E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
    }

    //add method in the first
   public void add(E item) {
       //Create temporary node to hold the add node
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    // add method
    public void add(E item, Node<E> node) {
        //Create temporary node to hold the add node
        Node<E> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    //Size method
    public int size() {
        return size;
    }

    //Find method
    public boolean find(E item) {
        //checking the head
        if(head == null){
            return  false;
        }
        //Create temporary node to compare with the given item
        Node<E> current = head;
            //Traversing through all the node till found match
            while (current != null) {
                if (current.data == item) {
                    return true;
                }
                current = current.next;
            }

            return false;
    }

    //Maximum method
    public int max(){
        //creating new node to compare with the given item
        Node<E> current = head;
        int max = 0;
        //Traversing through all the node till found match
        while(current != null){
            //if the node.data is max return
            if((int)current.data > max) {
                max = (int) current.data;
            } else {
                max = max;
            }
            //making go to the next node
            current = current.next;
        }
        return max;

    }
    //Minimum method
    public int min(){
        //creating new node to compare
        Node<E> current = head;
        int min = (int)current.next.data;
        //Traversing through all the node till found match
        while(current != null){
            //If the min found return
            if((int)current.data < min) {
                min = (int) current.data;
            } else{
                min = min;
            }
            //Making go to the next node
           current = current.next;
        }
        return min;
    }
    //printing all the info
    public  String toString(){
        Node<E> current = head;
        StringBuilder result  = new StringBuilder();

        while(current != null){
            result.append(current.data);
            if(current.next != null){
                result.append(" : ");
            }
                current = current.next;
        }
        return result.toString();
    }
}
