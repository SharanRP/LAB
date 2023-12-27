import java.util.Arrays;
/**
* The MyLongArray class represents an array of long integers with various
operations.
*/
public class MyLongArray {
private long[] a; // Internal array
private int currentIndex; // Index of the last element available in the array
/**
* Initializes a new MyLongArray with the given size.
*
* @param size The initial size of the array.
*/
public MyLongArray(int size) {
a = new long[size];
currentIndex = -1;
}
/**
* Searches for a given value in the array and returns its index.
*
* @param searchKey The value to search for.
* @return The index of the first occurrence of the value, or -1 if not
found.
*/
public int find(long searchKey) {
for (int i = 0; i <= currentIndex; i++) {
if (a[i] == searchKey) {
return i;
}
}
return -1;
}
/**
* Inserts a value into the array at the currentIndex and increments
currentIndex.
*

* @param value The value to insert.
*/
public void insert(long value) {
if (currentIndex < a.length - 1) {
currentIndex++;
a[currentIndex] = value;
} else {
System.out.println("Array is full. Cannot insert.");
}
}
/**
* Retrieves the element at a specified index in the array.
*
* @param index The index of the element to retrieve.
* @return The element at the specified index, or -1 if the index is
out of bounds.
*/
public long getElement(int index) {
if (index <= currentIndex) {
return a[index];
} else {
return -1;
}
}
/**
* Deletes the first occurrence of a specified value from the array.
*
* @param value The value to delete.
* @return True if the value was deleted, false if it was not found.
*/
public boolean delete(long value) {
int indexToDelete = find(value);
if (indexToDelete != -1) {
for (int i = indexToDelete; i < currentIndex; i++) {
a[i] = a[i + 1];
}
currentIndex--;
return true;
} else {
return false;

}
}
/**
* Displays all elements of the array.
*/
public void display() {
for (int i = 0; i <= currentIndex; i++) {
System.out.print(a[i] + " ");
}
System.out.println();
}
/**
* Deletes all occurrences of a specified value from the array and
returns the number of elements deleted.
*
* @param value The value to delete.
* @return The number of elements deleted.
*/
public int dupDelete(long value) {
int deletedCount = 0;
int indexToDelete;
while ((indexToDelete = find(value)) != -1) {
for (int i = indexToDelete; i < currentIndex; i++) {
a[i] = a[i + 1];
}
currentIndex--;
deletedCount++;
}
return deletedCount;
}
/**
* Inserts a value at a specified index in the array.
* If the index is greater than currentIndex, the value is inserted at
currentIndex.
*
* @param index The index at which to insert the value.
* @param value The value to insert.
*/

public void insert(int index, long value) {
if (index <= currentIndex) {
for (int i = currentIndex; i >= index; i--) {
a[i + 1] = a[i];
}
a[index] = value;
currentIndex++;
} else {
System.out.println("Warning: Index is greater than current index. Inserting at currentIndex.");
insert(value);
}
}
}