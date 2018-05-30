/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewq;

/**
 *
 * @author Akanksha
 */
public class linkedlisttest {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
 
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        linkedlisttest llist = new linkedlisttest();
 
        llist.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        
        llist.head.next=second;
        second.next=third;
        
        while(llist.head!=null)
        {
            System.out.println(llist.head.data);
            llist.head = llist.head.next;
            
        }
}
    
}
