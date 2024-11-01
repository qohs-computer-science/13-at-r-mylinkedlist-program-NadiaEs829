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

  System.out.println("Current list after adding 10 values: " + myList.toString()); // change to toString?
  System.out.println("The current size of the list is: " + myList.size());

//Removing the 5th, first, and last values of MyList
myList.set(4,"k"); //set method
System.out.println("Current list after setting the value at the 5th position to k: " + myList.toString());

  myList.remove(5);
  System.out.println("Current list after removing the value at the 6th position " + myList.toString());  //removed "2"

  myList.removeFirst();       //removed "60"
  System.out.println("Current list after removing the first value: " + myList.toString());

  myList.removeLast();        // removed Spongebob
  System.out.println("Current list after removing last value: " + myList.toString());

  //System.out.println("Current list after removing last value: " + myList); //current list
  System.out.println("The value of the 3rd position is: " + myList.get(2));

  System.out.println("Is the current list empty? " + myList.isEmpty());
  } // end main
} // end class
