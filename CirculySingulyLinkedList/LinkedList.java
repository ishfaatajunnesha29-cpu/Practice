/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirculySingulyPractice;

/**
 *
 * @author ISHFAA TAJ
 */
public class LinkedList 
{
    Node head = null;
    Node tail = null;
    public void insert(int value)
    {
        
        Node n = new Node(value);
        
        if(head==null)
        {
            head = n;
            tail = n;
            tail.next = head;
        }
        
        else
        {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
        
    }
    public void display()
    {
        
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        do
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }
}
