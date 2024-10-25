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
    int size = 0;
}//end constructor

///add method
public void add(Object myObj){
    head.setNext(myObj);
}//end add method 1

public void addFirst(Object myObj){
    head = myObj;
    myObj.setNext();

}//end add method

public void addLast(Object myObj){
    if(head.getNext() == null)
        head.setNext(myObj);
}//end add method

//set method
public Object set(int i, Object myObj){
    
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


//toString method
public String toString(){
    return ;
}//end toString method

}//end class
