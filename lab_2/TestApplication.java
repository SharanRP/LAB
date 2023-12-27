import java.util.Scanner;
public class TestApplication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the initial array: ");
int size = scanner.nextInt();
MyLongArray array = new MyLongArray(size);
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
System.out.print("Element " + (i + 1) + ": ");
long element = scanner.nextLong();
array.insert(element);
}
System.out.println("Original Array:");
array.display();
System.out.print("Enter an element to find: ");
long searchKey = scanner.nextLong();
int index = array.find(searchKey);
if (index != -1) {

System.out.println("Element found at index " + index);
} else {
System.out.println("Element not found in the array.");
}
System.out.print("Enter an element to delete: ");
long deleteValue = scanner.nextLong();
boolean deleted = array.delete(deleteValue);
if (deleted) {
System.out.println("Element deleted successfully.");
} else {
System.out.println("Element not found in the array.");
}
System.out.print("Enter an element to duplicate delete: ");
long duplicateDeleteValue = scanner.nextLong();
int deletedCount = array.dupDelete(duplicateDeleteValue);
System.out.println("Deleted " + deletedCount + " occurrences of " +
duplicateDeleteValue);
System.out.print("Enter an index to insert at: ");
int insertIndex = scanner.nextInt();
System.out.print("Enter an element to insert: ");
long insertValue = scanner.nextLong();
array.insert(insertIndex, insertValue);
System.out.println("Array after all operations:");
array.display();
scanner.close();
}
}