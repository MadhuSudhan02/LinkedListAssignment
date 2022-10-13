public class DeleteLinkedList <T> {

        Node<T> head, tail;
        static class Node <T>{

            T data;
            Node next;

            Node(T d)
            {
                data = d;
                next = null;
            }
        }


        public  void append(int data)
        {

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            }
            else {

                Node last = head;
                while (last.next != null) {
                    last = last.next;
                }


                last.next = new_node;
            }

        }


        public  void printList(DeleteLinkedList list)
        {
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            while (currNode != null) {

                System.out.print(currNode.data + " ");


                currNode = currNode.next;
            }
        }

        public  void insert(T data) {
            Node<T> newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                Node<T> temp, current;
                current = head;
                temp = head.next;
                current.next = newNode;
                newNode.next = temp;
            }
        }

        public T popFirst() {
            if (head == null) {
                return null;
            } else {
                T data = head.data;
                head = head.next;
                return data;
            }
        }

        public static void main(String[] args)
        {

            DeleteLinkedList<Integer> list = new DeleteLinkedList();


            list.append(56);
            list.append(70);
            list.insert(30);
            list.printList(list);
            list.popFirst();
            list.printList(list);
        }
}
