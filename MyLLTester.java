//Nadia Escamilla, pd: 7, date: 10/22/24

import java.util.LinkedList;

public class MyLLTester
{
  public static void main(String [] args){
  LinkedList<Object> myList = new LinkedList<Object>();

  myList.add("Hello");
  myList.add("Hola");
  myList.add("Hi");
  myList.addLast("Car");
  myList.add("2");
  myList.addFirst("60");
  myList.addLast("Dog");
  myList.add("Good");
  myList.add("Morning");
  myList.add("Spongebob");
  myList.set(4,"k");
  System.out.println(myList);
  myList.remove(5);
  myList.removeFirst();
  myList.removeLast();
  System.out.println(myList);
  } // end main
} // end class
