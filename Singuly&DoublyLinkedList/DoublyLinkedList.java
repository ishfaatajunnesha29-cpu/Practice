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
import java.util.Scanner;
public class DoublyLinkedList
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        LinkedList ll= new LinkedList();

        
        System.out.print("Enter a length for previous Node : ");
        int preLen = Sc.nextInt();
        System.out.println();
        
        System.out.print("Enter a length for next Node : ");
        int nextLen = Sc.nextInt();
        System.out.println();
        
        for(int i=0;i<preLen;i++)
        {
            System.out.print("Enter a value for previous Insertion "+(i+1)+" :");
            int value = Sc.nextInt();
            ll.insertStart(value);
        }
        
        for(int i=0;i<nextLen;i++)
        {
            System.out.print("Enter a value for next Insertion "+(i+1)+" :");
            int value1 = Sc.nextInt();
            ll.insertEnd(value1);
        }
        
        ll.display();
    }
    
}
