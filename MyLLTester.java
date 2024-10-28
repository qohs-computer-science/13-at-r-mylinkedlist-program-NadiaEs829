//Nadia Escamilla, pd: 7, date: 10/22/24

import java.util.LinkedList;

public class MyLLTester.java
{
  public static void main(String [] args)
  {
  //Day 1: Create a list, add a few values to it, test toString
  //Day 2: Test get, set, and toString
  //Day 3: Test all versions of remove
  //Day 4: Final edits, make sure you check special cases - all add versions on an empty list, all remove versions on an empty list
  LinkedList<String> myList = new LinkedList<String>();
  isEmpty();
  myList.add("Hello");
  myList.add("Hola");
  myList.add("Hi");
  myList.add("Car");
  myList.add("2");
  myList.add("60");
  myList.add("Taco");
  myList.add("Good");
  myList.add("Morning");
  myList.add("Nadia");
  toString();
  myList.set(4,"k");
  } // end main
  
} // end class
