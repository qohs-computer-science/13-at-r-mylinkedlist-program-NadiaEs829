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
//change some methods to private

//Constructor
public MyLinkedList(){
    head = null;
    int size = 0;
}//end constructor

///add method
public void add(Object myObj){
    head = new ListNode(myObj, null);
}//end add method 1

public void addFirst(Object myObj){
    head = new ListNode(myObj,head);
}//end add method

public void addLast(Object myObj){
    if(head.getNext() == null)
        head = new ListNode(myObj, null);
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
         //thrown in an exception
}//end removeFirst method


//toString method
public String toString(){
    return;
}//end toString method

}//end class
