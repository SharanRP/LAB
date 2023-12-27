import java.util.Random;
/**
* The MyLongArray class represents an array of long integers with various
* operations such as insertion, deletion, searching, sorting, and more.
*/
public class MyLongArray {
private long[] a;
private int currentIndex;
/**
* Constructs a MyLongArray with the specified size.
*
* @param size The initial size of the internal array.
*/
public MyLongArray(int size) {
a = new long[size];
currentIndex = -1;
}
/**
* Searches for a given value in the array.
*
* @param searchKey The value to search for.
* @return The index of the first occurrence of the searchKey in the
array,
* or -1 if not found.
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
* Inserts a value into the array at the current index.
*

* @param value The value to insert.
*/
public void insert(long value) {
if (currentIndex < a.length - 1) {
a[++currentIndex] = value;
} else {
System.out.println("Array is full. Cannot insert more elements.");
}
}
/**
* Retrieves the element at the specified index in the array.
*
* @param index The index of the element to retrieve.
* @return The element at the specified index, or -1 if the index is
out of bounds.
*/
public long getElement(int index) {
if (index >= 0 && index <= currentIndex) {
return a[index];
} else {
return -1;
}
}
/**
* Deletes the first occurrence of a specified value from the array.
*
* @param value The value to delete.
* @return true if the value is found and deleted; false otherwise.
*/
public boolean delete(long value) {
int index = find(value);
if (index != -1) {
for (int i = index; i < currentIndex; i++) {
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
* Deletes all occurrences of a specified value from the array.
*
* @param value The value to duplicate delete.
* @return The number of elements deleted.
*/
public int dupDelete(long value) {
int count = 0;
int index;
do {
index = find(value);
if (index != -1) {
for (int i = index; i < currentIndex; i++) {
a[i] = a[i + 1];
}
currentIndex--;
count++;
}
} while (index != -1);
return count;
}
/**
* Inserts a value at the specified index in the array.
*
* @param index The index at which to insert the value.
* @param value The value to insert.
*/
public void insert(int index, long value) {
if (index >= 0 && index <= currentIndex) {
if (currentIndex < a.length - 1) {

for (int i = currentIndex; i >= index; i--) {
a[i + 1] = a[i];
}
a[index] = value;
currentIndex++;
} else {
System.out.println("Array is full. Insertion at index " +

index + " not possible.");

}
} else {
System.out.println("Invalid index. Insertion aborted.");
}
}
/**
* Initializes the array with random long values.
*/
public void initArray() {
Random random = new Random();
for (int i = 0; i < a.length; i++) {
a[i] = random.nextLong();
}
currentIndex = a.length - 1;
}
/**
* Sorts the array using the bubble sort algorithm.
*/
public void bubbleSort() {
for (int i = 0; i <= currentIndex; i++) {
for (int j = 0; j <= currentIndex - i - 1; j++) {
if (a[j] > a[j + 1]) {
// Swap a[j] and a[j+1]
long temp = a[j];
a[j] = a[j + 1];
a[j + 1] = temp;
}
}
}
}
/**
* Sorts the array using the selection sort algorithm.

*/
public void selectionSort() {
for (int i = 0; i <= currentIndex; i++) {
int minIndex = i;
for (int j = i + 1; j <= currentIndex; j++) {
if (a[j] < a[minIndex]) {
minIndex = j;
}
}
// Swap a[i] and a[minIndex]
long temp = a[i];
a[i] = a[minIndex];
a[minIndex] = temp;
}
}
/**
* Sorts the array using the insertion sort algorithm.
*/
public void insertionSort() {
for (int i = 1; i <= currentIndex; i++) {
long key = a[i];
int j = i - 1;
while (j >= 0 && a[j] > key) {
a[j + 1] = a[j];
j = j - 1;
}
a[j + 1] = key;
}
}
}