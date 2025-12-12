/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingulyPractice;

/**
 *
 * @author ISHFAA TAJ
 */
import java.util.Scanner;
public class SingulyLinkedList 
{

    public static void main(String[] args)
    {
       Scanner Sc=new Scanner(System.in); 
       LinkedList ll = new LinkedList();
       
        System.out.print("Enter a length of a Node : ");
        int len = Sc.nextInt();
        System.out.println();
        
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter a value for "+(i+1)+" : ");
            int value=Sc.nextInt();
            ll.insert(value);
        }
       
       ll.display();
        
    }
    
}
