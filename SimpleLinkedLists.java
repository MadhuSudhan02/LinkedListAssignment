public class SimpleLinkedLists {
    Node head;
    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public static SimpleLinkedLists append(SimpleLinkedLists list, int data)
    {

        Node new_node = new Node(data);


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

        return list;
    }


    public static void printList(SimpleLinkedLists list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");


            currNode = currNode.next;
        }
    }


    public static void main(String[] args)
    {

        SimpleLinkedLists list = new SimpleLinkedLists();


        list = append(list, 56);
        list = append(list, 30);
        list = append(list, 70);


        printList(list);
    }
}
