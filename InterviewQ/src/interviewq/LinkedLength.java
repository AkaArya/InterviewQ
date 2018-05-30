/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewq;
import java.util.*;


public class LinkedLength {
    
   static Nod head;
    void push(int new_data)
    {
         Nod new_node = new Nod(new_data);
         new_node.next = head;
         head = new_node;    
    }
      
    int getCount()
    {
        Nod temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    void printList(Nod node)
    {
        while(node!=null)
        {
            System.out.println(node.data + " ");
            node= node.next;
        }
    }
    
    Nod reverse(Nod node)
    {
        Nod prev=null;
        Nod current=node;
        Nod next=null;
        while(current!=null)
        {
            next=current.next; 
            current.next=prev;
            prev=current;
            current=next;
            
        }
        node=prev;
        return node;
    }
    
   
   public static void main(String[] args)
    {
        /* Start with the empty list */
        LinkedLength llist = new LinkedLength();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        System.out.println("Count of nodes is " + llist.getCount());
        llist.printList(head);
        System.out.println("Reversing.. ");
        head=llist.reverse(head);
        llist.printList(head);
    } 
}

class Nod
    {
        Nod next;
        int data;
        Nod(int n)
        {
            data=n;
            next=null;
        }
        
    }