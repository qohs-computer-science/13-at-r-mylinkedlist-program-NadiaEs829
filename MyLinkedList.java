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
    ListNode temp = head;
    while(temp != null)
        temp = temp.getNext();
    temp = new ListNode(newItem, null);
    return true;
}//end add method

//set method
public Object set(int i, Object myObj){
    head= new ListNode(myObj);
}//end set method

//get method
public Object get(int i){
    if(head!=null)
        return head.getValue(i);
}//end get method

//remove methods
public Object remove(int i){
    ListNode temp = temp.getValue(i);
    if(temp != null)
        temp = temp.getNext();
}//end remove method

public Object removeFirst(){
    if(head!=null)
        head = new ListNode(head.getNext());
    else 
         throw new IndexOutOfBoundsException();
}//end removeFirst method


//toString method
public String toString(){
    return new ListNode(head,head.next());
}//end toString method

}//end class
