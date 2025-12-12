/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyPractice;

/**
 *
 * @author ISHFAA TAJ
 */
public class Node 
{
    int data;
    Node next;
    Node previous;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
class LinkedList
{
    Node head;
    
    public void insertStart(int value)
    {
         Node n = new Node(value);
         
         if(head!=null)
         {
             n.next = head;
             head.previous = n;
         }
         head = n;
    }
    public void insertEnd(int value)
    {
        Node n = new Node(value);
        
        if(head==null)
        {
            head =n;
            return;
        }
        
         Node temp = head;
         while(temp.next!=null)
         {
             temp = temp.next;
         }
         temp.next = n;
         n.previous = temp;
    }     
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
