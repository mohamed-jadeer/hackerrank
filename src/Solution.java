import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

public static Node removeDuplicates(Node head) {
      //Write your code here
        Node currNode = head;
        if(currNode == null){
            return head;
        }
        Node nextNode = head.next;
        while(currNode != null){
            if((nextNode != null) && (currNode.data == nextNode.data)){
                nextNode = nextNode.next;
                while((nextNode != null) && (currNode.data == nextNode.data)){
                    nextNode = nextNode.next;
                }
                if(nextNode == null){
                    currNode.next = null;
                    return head;
                }
                currNode.next = nextNode;
                currNode = currNode.next;
                nextNode = currNode.next;
            }
            else if(nextNode == null){
                currNode.next = null;
                currNode = currNode.next;
            }
            else{
                currNode = currNode.next;
                nextNode = currNode.next;
            }
        }
        return head;
    }

public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }