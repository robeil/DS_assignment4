package DS_assignment4;

public class Main {
    public static void main(String[] args) {

        singleLinkedList<Integer> list = new singleLinkedList<>();

        list.add(100);
        list.add(11);
        list.add(22);
        list.add(44);
        list.add(55);


        System.out.println("The size is : " + list.size());
        System.out.println(list.toString());
        System.out.println(list.find(22));
        System.out.println("Maximum " + list.max());
        System.out.println("Minimum " + list.min());
        //System.out.println(list.find(22)); //FIXME --->

        System.out.println(list.getNode(22));

    }
}
