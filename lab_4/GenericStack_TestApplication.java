import java.util.*;

/**
* A generic stack data structure that allows pushing and popping elements.
* The stack has a specified capacity, and it supports checking if it's
empty or full.
*
* @param <E> the type of elements stored in the stack.
*/
class GenericStack < E >
{
/**
* An array to store the elements in the stack.
*/
private final E[] elements;
/**
* Index pointing to the top element of the stack.
*/
private int top;
/**
* Creates a new GenericStack with the specified capacity.
*
* @param capacity the maximum number of elements the stack can hold.
*/

public GenericStack (int capacity)
{
elements = (E[])new Object[capacity];
top = -1;
}
/**
* Pushes an element onto the stack.
*
* @param item the element to be pushed onto the stack.
* @throws IndexOutOfBoundsException if the stack is full.
*/
public void push (E item)
{
top++;
if (top == elements.length)
{
throw new IndexOutOfBoundsException ("Stack is Full");
}
elements[top] = item;
}
/**
* Pops the top element from the stack.
*
* @return the element that was removed from the top of the stack.
*/
public E pop ()
{
top--;
return elements[top + 1];
}
/**
* Peeks at the top element of the stack without removing it.
*
* @return the top element of the stack.
*/
public E top ()
{
return elements[top];
}
/**
* Checks if the stack is empty.
*
* @return true if the stack is empty, false otherwise.

*/
public boolean isEmpty ()
{
return top == -1;
}
/**
* Checks if the stack is full.
*
* @return true if the stack is full, false otherwise.
*/
public boolean isFull ()
{
return top == elements.length - 1;
}
}
/**
* A test application for the GenericStack class, allowing the user to
interact with a stack.
*
*/
public class GenericStack_TestApplication
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);
System.out.print ("Define the limit for the stack: ");
int capacity = sc.nextInt ();
GenericStack < Integer > stack = new GenericStack <> (capacity);
int select;
do
{
System.out.print ("Menu:\n" +
"1. Push Element\n" +
"2. Pop Element\n" +
"3. Top Element\n" +
"4. Check if Empty\n" +
"5. Check if Full\n" +
"0. Exit Program\n" +
"Enter Sr. No. of Operation: ");

select = sc.nextInt ();
switch (select)
{
case 1:

System.out.print ("Please input the element you wish to push: ");
int temp = sc.nextInt ();
stack.push (temp);
break;
case 2:System.out.println ("The element popped is: " + stack.pop

());

break;
case 3:System.out.println ("The element at the top is: " +

stack.top ());
break;
case 4:if (stack.isEmpty ())
{
System.out.println ("The Stack is Empty");
}
else
{
System.out.println ("The Stack is not Empty");
}
break;
case 5:
if (stack.isFull ())
{
System.out.println ("The Stack is Full");
}
else
{
System.out.println ("The Stack is not Full");
}
break;
case 0:
System.out.println ("Exited program successfully");
break;
default:
throw new IllegalArgumentException ("Invalid Option");
}
}
while (select != 0);

sc.close ();
}
}