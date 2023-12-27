import java.util.Scanner;
/**
* The TestMyLongArray class is a test application for demonstrating the
* operations of the MyLongArray class.
*/
public class TestMyLongArray {
public static void main(String[] args) {
MyLongArray myArray = new MyLongArray(10);
Scanner scanner = new Scanner(System.in);
// Automatically initialize the array
myArray.initArray();
while (true) {
System.out.println("\nMenu:");
System.out.println("1. Bubble Sort");
System.out.println("2. Selection Sort");
System.out.println("3. Insertion Sort");
System.out.println("4. Find Element");
System.out.println("5. Insert Element");
System.out.println("6. Delete Element");
System.out.println("7. Duplicate Delete Element");
System.out.println("8. Get Element");
System.out.println("9. Display Array");
System.out.println("10. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
myArray.bubbleSort();
System.out.println("Array elements after bubble sort:");
myArray.display();
break;
case 2:
myArray.selectionSort();
System.out.println("Array elements after selection sort:");
myArray.display();

break;
case 3:
myArray.insertionSort();
System.out.println("Array elements after insertion sort:");
myArray.display();
break;
case 4:
System.out.print("Enter the value to find: ");
long findValue = scanner.nextLong();
int findIndex = myArray.find(findValue);
if (findIndex != -1) {
System.out.println("Value " + findValue + " found at index " + findIndex);
} else {
System.out.println("Value " + findValue + " not found in the array.");
}
break;
case 5:
System.out.print("Enter the value to insert: ");
long insertValue = scanner.nextLong();
myArray.insert(insertValue);
System.out.println("Value " + insertValue + " inserted into the array.");
break;
case 6:
System.out.print("Enter the value to delete: ");
long deleteValue = scanner.nextLong();
boolean deleted = myArray.delete(deleteValue);
if (deleted) {
System.out.println("Value " + deleteValue + " deleted from the array.");
} else {
System.out.println("Value " + deleteValue + " not found in the array.");
}
break;
case 7:
System.out.print("Enter the value to duplicate delete: ");
long dupDeleteValue = scanner.nextLong();
int deletedCount = myArray.dupDelete(dupDeleteValue);
System.out.println("Deleted " + deletedCount + " occurrences of " +

dupDeleteValue);

break;
case 8:
System.out.print("Enter the index to get the element: ");
int getElementIndex = scanner.nextInt();
long element = myArray.getElement(getElementIndex);
if (element != -1) {
System.out.println("Element at index " + getElementIndex + ": " + element);
} else {
System.out.println("Index " + getElementIndex + " is out of bounds.");
}
break;
case 9:
System.out.println("Array elements:");
myArray.display();
break;
case 10:
System.out.println("Exiting the program.");
scanner.close();
System.exit(0);
default:
System.out.println("Invalid choice. Please enter a valid option.");
}
}
}
}