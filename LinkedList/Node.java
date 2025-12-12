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
public class Node 
{
    int data;
    Node next;
    Node pre;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}
