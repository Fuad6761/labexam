package project;

class Node {
int data;
Node next;
Node(int data) {
this.data = data;
next = null;
}
}

public class linkedlist {
Node head;
public linkedlist() {
head = null;
}
void append(int value) {
Node newNode = new Node(value);
if (head == null) {
head = newNode;
return;
}
// otherwise traverse to the end
Node current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
void display() {
Node current = head;
while (current != null) {
System.out.print(current.data + " ");
current = current.next;
}
System.out.println();
}
public static void main(String[] args) {
	linkedlistlist = new linkedlist();
list.append(1);
list.append(2);
list.append(3);
list.display(4);
list.display(5);
list.display();
}
}