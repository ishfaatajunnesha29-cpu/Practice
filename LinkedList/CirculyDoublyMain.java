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
public class CirculyDoublyMain 
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        
        ll.insertEnd(5);
        ll.insertStart(8);
        ll.insertStart(6);
        ll.insertEnd(23);
        ll.insertStart(29);
        ll.insertStart(7);
        ll.insertEnd(14);
        ll.insertStart(18);
        
        ll.display();
    }
    
}
