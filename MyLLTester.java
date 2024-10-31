//Nadia Escamilla, pd: 7, date: 10/22/24

import java.util.LinkedList;

public class MyLLTester
{
  public static void main(String [] args){
  LinkedList<Object> myList = new LinkedList<Object>();

  //adding 10 objects to myList
  myList.add("Hello");
  myList.add("Hola");
  myList.add("Hi");
  myList.addLast("Car");
  myList.add("2");
  myList.addFirst("60"); //add first
  myList.addLast("Dog"); //add last
  myList.add("Good");
  myList.add("Morning");
  myList.add("Spongebob");
  myList.set(4,"k"); //set method
  System.out.println(myList); // change to toString?

//Removing the 5th, first, and last values of MyList
  myList.remove(5);
  System.out.println("Current list after removing value at index 5 " + myList);     //removed "2"
  myList.removeFirst();       //removed "60"
  System.out.println("Current list after removing the first value: " + myList);
  myList.removeLast();        // removed Spongebob
  System.out.println("Current list after removing last value: ");
  toString();
  //System.out.println("Current list after removing last value: " + myList); //current list
  System.out.println("The value of last index is: " + myList.get(6));
  } // end main
} // end class
