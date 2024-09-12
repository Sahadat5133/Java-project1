public class Linklist {
     /*1.variable size
     2.non-contigious memory
     3.insert o(1)
     4.search o(n)
      */
    class Node{
        String data;
        Node next;
        Node(String data){//constructor
            this.data=data;
            this.next=null;
        }
    }
        
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    public static void main(String[] args) {
        Linklist list = new Linklist();//ll class ki object
        list.addFirst("a");
        list.addFirst("is");
 }

