package LinkedList;

import java.util.Scanner;

public class LinkedListUse
{
    public static void main(String[] args)
    {
        Node<Integer> head=takeInput();
        print(head);

        head=createLinkedList();
        print(head);
    }
    public static Node<Integer> createLinkedList()
    {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        n1.next=n2;
        n2.next=n3;
        return n1;
    }
    public static void print(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //this method takes input from the user and creates linked list until the user enters -1
    //then return the head of the linked list
    public static Node<Integer> takeInput()
    {
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null; // first node in linked list
        Node<Integer> tail=null; // last node in linked list
        while(data!=-1)
        {
            Node<Integer> currentNode=new Node<>(data);
            if(head==null)
            {
                head=currentNode;
                tail=head;
            }
            else
            {
                tail.next=currentNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }
}


