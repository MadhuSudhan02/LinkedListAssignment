public class AppendLinkList {
    SimpleLinkedLists.Node head;
    static class Node {

        int data;
        SimpleLinkedLists.Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public static SimpleLinkedLists append(SimpleLinkedLists list, int data)
    {

        SimpleLinkedLists.Node new_node = new SimpleLinkedLists.Node(data);


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            SimpleLinkedLists.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

        return list;
    }


    public static void printList(SimpleLinkedLists list)
    {
        SimpleLinkedLists.Node currNode = list.head;

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
