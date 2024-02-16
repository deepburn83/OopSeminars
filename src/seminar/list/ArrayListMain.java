package seminar.list;

import seminar.list.core.lists.MyLinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//
//        list.add(3);
//        list.add(5);
//        list.add(6);
//
//        System.out.println(list);
//        System.out.println(list.get(1));
//
//        list.remove(2);
//
//        System.out.println(list);
//        System.out.println(list.size());

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.addFirst(31);
        linkedList.addFirst(50);
        linkedList.addFirst(69);
        linkedList.addLast(49);
        linkedList.addLast(10);

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));

        linkedList.remove(2);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}