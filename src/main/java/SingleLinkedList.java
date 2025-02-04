
    public class SingleLinkedList {
        private int nodeValue;

        static class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
                this.next = null;
            }

            public Node() {

            }
        }

        public Node head;
        public Node tail;
        public int size;


    public Node createLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert int linked list
    //0. if the link doesn't
    //1. inserting at the beginning
    //2. inserting at the ending
    //3. inserting anywhere

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createdLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = node;
        }
        size++;
    }

        private void createdLinkedList(int nodeValue) {
        }

        // Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node temNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if (i != size -1 ){
                    System.out.print(" -> ");
                }
                temNode = temNode.next;
            }
            System.out.print("\n");
        }
    }


    // search for a Node

    public boolean searchNode (int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Deleting a Node from the linked list
    //0. if the link doesn't
    //1. delete at the beginning
    //2. delete at the ending
    //3. delete anywhere

        public static Node deleteHeadLinkedList (Node head, int location) { //Delete head (beginning) of linked list
            if (head == null) {
                return null;

                Node temp = head;
                head = head.next;
                temp = null;
                return head;
            }

            public static Node printLinkedList (Node head){
                while (head != null) {
                    System.out.print(head.value + "->");
                    head = head.next;
                }
                System.out.println("null");
            }

            public static Node deleteEndLinkedList (Node head int location){ //Delete end of Linked List
                if (head == null) {
                    return null;
                }
                if (head.next == null) {
                    return null;
                }
                Node secondLast = head;
                while (secondLast.next.next != null) {
                    secondLast = secondLast.next;
                }
                secondLast.next = null;
                return head;
            }
            public static Node printLinkedList (Node head){
                while (head != null) {
                    System.out.print(head.value + "->");
                    head = head.next;
                }
                System.out.println("null");
            }

            static Node deleteNode (Node head,int location){ //Deleting Node from middle of Linked List
                Node temp = head;
                Node prev = null;

                if (temp == null)
                    return head;

                for (int i = 1; temp != null && i < position; i++) {
                    prev = temp;
                    temp = temp.next;
                }
                if (temp != null) {
                    prev.next = temp.next;
                } else {
                    System.out.println("Node not found");
                }
                return head;
            }

            static Node printLinkedList (Node head){
                while (head != null) {
                    System.out.print(head.value + "->");
                    head = head.next;
                }
                System.out.println("null");
            }
        }}