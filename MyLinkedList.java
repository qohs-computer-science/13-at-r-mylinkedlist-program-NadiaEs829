//Nadia Escamilla, pd: 7, date: 10/22/24
public class MyLinkedList
{
//Day 1: Add fields, create constructor, create at least 1 add method, write toString
//Day 2: Add additional constructors, set and get methods
//Day 3: Add remove methods
//Day 4: debug

//fields
private ListNode head;

//Constructor
public MyLinkedList(){
    head = null;
}//end constructor

public boolean IsEmpty(){
    if(head==null)
        return true;
    else 
        return false;
}//end isEmpty method

///add method
public boolean add(Object newItemj){
    return true;
}//end add method 1

public boolean addFirst(Object newItemj){
    if(head!=null)
        head = new ListNode(newItem,head);
    else 
        head = newItem;
    return true;
}//end add method

public boolean addLast(Object newItem){
    ListNode last = head;
    ListNode temp = last.getNext();
    if(head == null)
        head = new ListNode(newItem,null);
    
    while(last.getNext() != null)
        last = last.getNext();
    last = 
    tempNext = new ListNode(newItem,null);
    return true;
}//end add method

//remove methods
private Object remove(int i){
    Node temp = head;
    Node prev = null;
    Node prevNext = prev.getNext();
    Node tempNext = temp.getNext();

    if(temp == null)
        return null;

    if(i == 0){
        head = null;
        return i;
    }//end if

    for(int j = 0; temp != null && j < i; j++){
        prev = temp;
        temp = null;
    }//end for loop
  
    if(temp != null)
        prevNext = tempNext;
    return i;
}//end remove method

private Object removeFirst(){
    if(head==null)
        throw new IndexOutOfBoundsException();
    Node temp = head;   
    head = head.getNext();

    temp = null;
    return head;    //returns the new head
}//end removeFirst method

private Object removeLast(){
    if(head == null || head.getNext() == null){
        return null;

    Node secToLast = head;
    while(secToLast.next.next != null)
        secToLast = secToLast.next;
    }//end method
}//end remove 

//set method
public Object set(int i, Object myObj){
    head = new ListNode(myObj);
}//end set method

//get method
public Object get(int i){
    if(head!=null)
        return head.getValue(i);
}//end get method

//toString method
//public String toString(){
//    return new ListNode(head,head.next());
//}//end toString method

}//end class
