public class SLL {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // addFirst

    public void addFirst(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // addLast

    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    // Transversal/ printing the list

    public void printList(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}

// removeFirst

    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list, Nothing to remove");
            return;
        }
        head=head.next;
    }

// removeLast

    public void removeLast(){
        if(head==null){
            System.out.println("Empty list, Nothing to remove");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node last=head.next;
        Node secondLast=head;

        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

// getting size

    public int size(){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int size=1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;

    }

    // add at specific position

    public void addAtPosition(int data, int pos) {
    if (pos < 0) {
        System.out.println("Invalid position");
        return;
    }

    Node newNode = new Node(data);

    if (pos == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node temp = head;
    for (int i = 0; i < pos - 1; i++) {
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}

// searching the specific value

public boolean search(int value){
    if(head==null){
        return false;
    }

    Node temp=head;
    while(temp.next!=null){
        if(temp.data==value){
            return true;
        }
        temp=temp.next;
    }
    return false;
}

// remove by value

public void removeByValue(int value){
    if(head==null){
        return;
    }

    if(head.data==value){
        head=head.next;
        return;
    }
    Node temp=head;

    while(temp.next!=null && temp.next.data !=value){
        temp=temp.next;
    }

    if(temp.next!=null){
        temp.next=temp.next.next;
    }
}

// reverseing the linked list

public Node reverse(Node head){
    if (head == null || head.next == null){
         return head;
    }
           
    Node prev=null;
    Node curr=head;
    Node next=null;

    while (curr != null) {
            next = curr.next; 
            curr.next = prev;     
            prev = curr;          
            curr = next;
    }

    return prev;
}

// reverseing the linked list with recursion

public Node reverseWithRecursion(Node head) {

        if (head == null || head.next == null)
            return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public int findMiddle() {
        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
    
    public static void main(String[] args) {
        SLL list= new SLL();
        System.out.println(list.size());
        list.addFirst(10);
        list.printList();
        System.out.println(list.size());
        list.addFirst(5);
        list.printList();
        System.out.println(list.size());
        list.addLast(15);
        list.addLast(20);
        list.printList();
        list.addAtPosition(12, 3);
        list.printList();
        System.out.println(list.search(12));
        System.out.println(list.search(11));
        list.removeByValue(12);
        list.printList();
        list.head=list.reverseWithRecursion(list.head);
        list.printList();
        System.out.println(list.findMiddle());
        // list.addAtPosition(99, 2);
        list.printList();  
        System.out.println(list.findMiddle());
    }
}
