package DS_assignment4;

public class singleLinkedList<E> {

    //data fields
    private Node<E> head = null;
    private int size = 0;

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
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    // add method
    public void add(E item, Node<E> node) {
        //temporary node to hold the add node
        Node<E> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    //Size method
    public int size() {
        return size;
    }
    //getting node
    public Node<E> getNode(E item){
        Node<E> node = head;
        for(int i = 0; i < size && node != null; i++){
            if(item.equals(node.data))
            node = node.next;
        }
        return node;
    }

    //Find method
    public boolean find(E item) { //FIXME --->
        Node<E> current = head;

            while (current.next != null) {

                if (item.equals(current.next.data)) {//FIXME --->
                    // current.data = item;
                    current = current.next;
                    System.out.println(current.data);
                    return true;
                }
                break;
            }

            return false;

    }//FIXME --->

    //Maximum method
    public int max(){//FIXME ---->

        Node<E> current = head;
        int max = 0;

        while(current.next != null){

            if((int)current.data > (int)current.next.data)
                //max = (int)current.data;
                current = current.next;
            break;
        }

        //return max;
        return (int)current.next.data;
    } ////FIXME ---->
    //Minimum method
    public int min(){ //FIXME ---->

        Node<E> current = head;
        int min = (int)current.data;

        while(current.next != null){
            while((int)current.data < (int)current.next.data)
                min = (int)current.data;
                break;
        }
        return min;
    } //FIXME ----->

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
