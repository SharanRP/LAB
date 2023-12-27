import java.util.Scanner;

/**
 * A generic queue data structure that allows enqueueing and dequeuing elements.
 * The queue has a specified capacity, and it supports checking if it's empty,
 * finding the first element, and retrieving its size.
 *
 * @param <E> the type of elements stored in the queue.
 */
class GenericQueue<E> {
    /**
     * An array to store the elements in the queue.
     */
    private final E[] elements;
    /**
     * Index representing the front of the queue.
     */
    private int front = 0;
    /**
     * Index representing the rear of the queue.
     */
    private int rear = -1;
    /**
     * The current size of the queue.
     */
    private int size = 0;

    /**
     * Creates a new GenericQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     */
    public GenericQueue(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    /**
     * Enqueues an element into the queue.
     *
     * @param e the element to be enqueued.
     */
    public void enqueue(E e) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = e;
        size++;
    }


    /**
     * Dequeues and removes the element at the front of the queue.
     *
     * @return the element that was dequeued, or null if the queue is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return answer;
    }

    /**
     * Retrieves the first element in the queue without removing it.
     *
     * @return the first element in the queue, or null if the queue is empty.
     */
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return elements[front];
    }

    /**
     * Gets the current size of the queue.
     *
     * @return the number of elements currently in the queue.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Reverses a string.
     *
     * @param str the string to reverse.
     * @return the reversed string.
     */
    public String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}

/**
 * A test application for the GenericQueue class, allowing the user to
 * interact with a queue.
 */
public class GenericQueue_TestApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Define the limit for the queue: ");
        int capacity = sc.nextInt();
        GenericQueue<Integer> queue = new GenericQueue<>(capacity);
        int select;

        do {
            System.out.print(
                    "Menu:\n" +
                            "1. Enqueue Element\n" +
                            "2. Dequeue Element\n" +
                            "3. First Element\n" +
                            "4. Check if Empty\n" +
                            "5. Size of Queue\n" +
                            "6. Reverse a String\n" +
                            "0. Exit Program\n" +
                            "Enter Sr. No. of Operation: ");

            select = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (select) {
                case 1:
                    System.out.print("Please input the element you wish to enqueue: ");
                    int temp = sc.nextInt();
                    queue.enqueue(temp);
                    break;

                case 2:
                    System.out.println("The dequeued element is: " + queue.dequeue());
                    break;

                case 3:
                    System.out.println("The element at the front is: " + queue.first());
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The Queue is Empty");
                    } else {
                        System.out.println("The Queue is not Empty");
                    }
                    break;

                case 5:
                    System.out.println("Size of Queue is: " + queue.size());
                    break;

                case 6:
                    System.out.print("Please enter a string to reverse: ");
                    String inputString = sc.nextLine();
                    String reversedString = queue.reverseString(inputString);
                    System.out.println("Reversed string: " + reversedString);
                    break;

                case 0:
                    System.out.println("Exited program successfully");
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Option");
            }
        } while (select != 0);
        sc.close();
    }
}

