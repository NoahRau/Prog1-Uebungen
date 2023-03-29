package Lektion12;

public class Kugel {
    private int size;
    public Node head;

    public Kugel() {
        head = new Node(1); // Erstelle die Kopf-Node
        Node current = head; // Setze current auf den Kopf der Liste
        for (int i = 2; i <= 49; i++) {
            current.next = new Node(i); // Erstelle eine neue Node und hänge sie an das Ende der Liste
            current = current.next; // Setze current auf die neue Node
        }
    }

    private class Node {
        public Node next;
        private int nummer;

        public Node(int value) {
            size++;
            nummer = value;
        }

        public int getNummer() {
            return nummer;
        }
    }




    public int getSize(){return size;
    }
    public int getNode(int number) {
        if (head == null) {
            return 0; // Die Liste ist leer, es gibt keine Node zu entfernen
        }

        Node temp = head;

        if (number == 0) {
            head = head.next; // Entferne die Kopf-Node
            size--;
            return temp.getNummer();
        }

        // Finde die Node an der gewünschten Stelle und entferne sie aus der Liste
        for (int i = 0; i < number-1; i++) {
            temp = temp.next;
            if (temp == null || temp.next == null) {
                return 0; // Die Node an der gewünschten Stelle gibt es nicht
            }
        }
        Node nodeToReturn = temp.next;
        temp.next = temp.next.next;
        size--;
        return nodeToReturn.getNummer();
    }


}
