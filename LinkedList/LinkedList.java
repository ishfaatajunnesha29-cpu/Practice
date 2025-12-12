/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirculyDoublyPractice;

/**
 *
 * @author ISHFAA TAJ
 */
public class LinkedList 
{
    Node head;
    Node tail;

    void insertStart(int value) 
    {
        Node n = new Node(value);
        
        if(head==null)
        {
            head = n;
            tail = n;
            head.next = head;
            head.pre = head;     
        }
        else
        {
            n.next = head;
            n.pre = tail;
            head.pre = n;
            tail.next = n;
            
            head = n;
        }
    } 
    void insertEnd(int value)
    {
        Node n = new Node(value);
        
        if(head==null)
        {
            head = n;
            tail =n;
            head.next = head;
            head.pre = head;
        }
        else
        {
            n.next = head;
            n.pre = tail;
            head.pre = n;
            tail.next = n;
            tail = n;
        }
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        do
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }
}
