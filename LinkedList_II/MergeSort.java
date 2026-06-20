package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class MergeSort
{
    public static void main(String[] args)
    {
       Node<Integer> head= LinkedListUse.takeInput();
       head=mergeSort(head);
       LinkedListUse.print(head);
    }
    public static Node<Integer> mergeSort(Node<Integer> head) {
        //Base Case
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> mid,part1Head,part2Head,finalHead,head1,head2;

        mid=midPoint(head);
        part1Head=head;
        part2Head=mid.next;
        mid.next=null;

        head1=mergeSort(part1Head);
        head2=mergeSort(part2Head);
        finalHead=merge(head1,head2);
        return finalHead;

    }
    //find mid point of the linkedlist
    public static Node<Integer> midPoint(Node<Integer> head)
    {
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //merge the two sorted linkedlists
    public static Node<Integer> merge(Node<Integer> h1, Node<Integer> h2) {

        if(h1==null)
        {
            return h2;
        }
        if(h2==null)
        {
            return h1;
        }
        Node<Integer> head=h1,tail=h1;
        if(h1.data<h2.data)
        {
            head=h1;
            tail=h1;
            h1=h1.next;
        }
        else
        {
            head=h2;
            tail=h2;
            h2=h2.next;
        }
        while(h1!=null && h2!=null)
        {
            if(h1.data < h2.data)
            {
                tail.next=h1;
                tail=tail.next;
                h1=h1.next;
            }
            else
            {
                tail.next=h2;
                tail=tail.next;
                h2=h2.next;
            }
        }
        if(h1!=null)
        {
            tail.next=h1;

        }
        else
        {
            tail.next=h2;
        }
        return head;
    }

}
