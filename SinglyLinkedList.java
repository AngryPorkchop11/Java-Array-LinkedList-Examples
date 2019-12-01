import java.util.LinkedList;

//***************************************************************************//
//*******************************Example 3***********************************//
//Making a linked list class from scratch and showing how to insert//
    //Singly linked list made from scratch
    public class SinglyLinkedList {
        static Node head;

         static class Node {
            int data;
            Node next;

            //Constructor
            Node(int x) {
                data = x;
                next = null;
            }
        }

        public static SinglyLinkedList insert(SinglyLinkedList list, int data)
        {
            //allocating a new node and fill it w/ data
            Node new_node = new Node(data);
            new_node.next = null;

            //empty list
            if (SinglyLinkedList.head == null){
                list.head = new_node;
            }
            //insert at end
            else {
                Node last = list.head;
                //traverse
                while (last.next != null) {
                    last = last.next;
                }

                //insert
                last.next = new_node;
            }
            return list;
        }

        public static void printList (SinglyLinkedList list)
        {
            Node currNode = list.head;
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
        public static void main(String[] args)
        {
            SinglyLinkedList list = new SinglyLinkedList();
            System.out.print("LinkedList: \n");

            list = insert(list, 1);
            printList(list);
            System.out.print("\n");
            list = insert(list, 2);
            printList(list);
            System.out.print("\n");
            list = insert(list, 3);
            printList(list);
            System.out.print("\n");
            list = insert(list, 4);
            printList(list);
            System.out.print("\n");
            list = insert(list, 5);
            printList(list);
            System.out.print("\n");
            list = insert(list, 6);
            printList(list);
            System.out.print("\n");
            list = insert(list, 7);
            printList(list);
            System.out.print("\n");
            list = insert(list, 8);
            printList(list);
            System.out.print("\n");

            //***************************************************************************//
            //*******************************Example 4***********************************//
            //Showing how to add with Javas built-in LinkedList class//

            //Note: LinkedList class does not take primitive types. The LinkedList must be the name of a class or an interface.
            //      In Java, Integer is a class that holds a number and int is just a number by its self.
            LinkedList<Integer> object = new LinkedList<Integer>();

            object.add(2);
            object.add(3);
            object.addLast(4);
            object.addFirst(1);
            object.add(5);
            object.add(6);
            object.add(7);
            object.add(8);
            System.out.println("\nFrom built-in LinkedList class:");
            System.out.println("Linked list: " + object);
        }
    }