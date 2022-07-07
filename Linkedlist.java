import java.util.*;
public class Linkedlist {
    Node head;
    class Node{
       String data;
       Node Next;
       Node(String data){
           this.data=data;
           this.Next=null;
       }
    }
    // Add element at First
    public void addFirst(String data){
        Node newNode = new Node(data);

        // List is emty or Not
        if (head==null){
            head=newNode;
            return;
        }

        newNode.Next=head;
        head=newNode;
    }

    // Add at Lat

    public void addLast(String data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
           return;
        }
        Node currNode = head;
       while (currNode.Next !=null){
            currNode=currNode.Next;
       }
       currNode.Next=newNode;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.print("list is emty");
            return;
        }
        Node currNode = head;
        while (currNode !=null){
          System.out.println(currNode.data+"->");
           currNode=currNode.Next;
        }
        System.out.println("NULL");
   }


    public static void main(String args[]){
        Linkedlist list = new Linkedlist();
        list.addFirst("a");
        list.addFirst("is");

        list.addFirst("this");
        //list.printList();
        list.addLast("list");
        list.printList();

    }
}
