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
public class AddOneToLinkedList {
    
    static Nodee head=null;
     
    void push(int data)
    {
        Nodee node= new Nodee(data);
        if(head!=null)
        {
            Nodee temp=head;
            while(temp.next!=null)
                temp=temp.next;               
            temp.next=node;
        }
        else
            head=node;
    }
    
    void printl(Nodee node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }
    
    Nodee reversing(Nodee node)
    {
        Nodee current=node;
        Nodee prev=null;
        Nodee next=null;
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
    
    Nodee addingOne(Nodee h)
    {
        Nodee node=reversing(h);
        Nodee res=node;
        Nodee temp=null,prev=null;
        //to add 1
        int carry=1;
        int sum;
        while(node!=null)
        {
            sum=carry+node.data;
            carry=(sum>=10)?1:0;
            sum=sum%10;
            node.data=sum;
            temp=node;
            node=node.next;
        }
        if(carry>0)
        {
            temp.next= new Nodee(carry);
            
        }
        //printl(res);
        head=reversing(res);
        return head;
    }
    
    public static void main(String[] args) {
        AddOneToLinkedList list1= new AddOneToLinkedList();
        list1.push(1);
        list1.push(9);
        list1.push(9);
        list1.printl(head);
        list1.addingOne(head);
        System.out.println("adding one..");
        list1.printl(head);
        
    }
    
}

class Nodee
{
    int data;
    Nodee next;
    Nodee(int data)
    {
     this.data=data; 
     next=null;
    }
}
