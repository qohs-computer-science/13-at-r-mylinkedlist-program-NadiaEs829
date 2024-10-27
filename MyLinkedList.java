//Nadia Escamilla, pd: 7, date: 10/22/24
public class MyLinkedList
{
//Day 1: Add fields, create constructor, create at least 1 add method, write toString
//Day 2: Add additional constructors, set and get methods
//Day 3: Add remove methods
//Day 4: debug

//fields
private ListNode head;
int size;

//Constructor
public MyLinkedList(){
    head = null;
    size = 0;
}//end constructor

public boolean IsEmpty(){
    if(head==null || size == 0)
        return true;
    else 
        return false;
}//end isEmpty method

///add method
public boolean add(Object newItemj){
    //head = new ListNode(newItemj, null);
    return true;
}//end add method 1

public boolean addFirst(Object newItemj){
    head = new ListNode(newItem,head);
    return true;
}//end add method

public boolean addLast(Object newItem){
    if(head.getNext() == null)
        head = new ListNode(newItem, null);
    return true;
}//end add method

//set method
public Object set(int i, Object myObj){
    head.indexOf(i) = new ListNode(myObj);
}//end set method

//get method
public Object get(int i){
    if(head!=null)
        return head.indexOf(i);
}//end get method

//remove methods
public Object remove(int i){
    if(head!=null)
        head.indexOf(i) = null;
}//end remove method

public Object removeFirst(){
    if(head!=null)
        head = new ListNode(head.getNext());
    else 
         throw new IndexOutOfBoundsException();
}//end removeFirst method


//toString method
public String toString(){
    return ;
}//end toString method

}//end class
