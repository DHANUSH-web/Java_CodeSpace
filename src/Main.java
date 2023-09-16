// CODE: 1

import java.util.Objects;

class Main {
    public static boolean checkSequence(CircularLinkedList<Integer>.Node<Integer> L, CircularLinkedList<Integer>.Node<Integer> M, int lengthM) {
        if (L == null && M == null)
            return true;

        CircularLinkedList<Integer>.Node<Integer> currentL = L;

        for (int i = 0; i < lengthM; i++) {
            CircularLinkedList<Integer>.Node<Integer> currentM = M;
            boolean matched = true;

            while (currentL != null && currentM != null) {
                if (!Objects.equals(currentL.data, currentM.data)) {
                    matched = false;
                    break;
                }

//                System.out.println("CurrentL Data: " + currentL.data + " CurrentM Data: " + currentM.data);

                currentL = currentL.next;
                currentM = currentM.next;
            }

            if (matched && currentL == null && currentM == null)
                return true;

            M = M.next;
        }

        return false;
    }

    public static boolean areSequence(CircularLinkedList<Integer>.Node<Integer> L, CircularLinkedList<Integer>.Node<Integer> M) {
        if (L == null && M == null)
            return true;

        CircularLinkedList<Integer>.Node<Integer> currentL = L;
        CircularLinkedList<Integer>.Node<Integer> currentM = M;

        do {
            if (currentL == null && currentM == null)
                return true;

            if (currentL == null || currentM == null || currentL.data != currentM.data)
                return false;

            currentL = currentL.next;
            currentM = currentM.next;

        } while (currentL != L || currentM != M);

        return false;
    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> L = new CircularLinkedList<>();
        CircularLinkedList<Integer> M = new CircularLinkedList<>();

        // add nodes to L
        L.addLast(10);
        L.addLast(20);
        L.addLast(30);
        L.addLast(40);
        L.addLast(L.getFirst());

        // add nodes to M
        M.addLast(20);
        M.addLast(30);
        M.addLast(40);
        M.addLast(10);
        M.addLast(M.getFirst());

        // check for sequence
        boolean isSequence = checkSequence(L.tail.next, M.tail.next, M.size);
//        boolean isSequence = areSequence(L.tail.next, M.tail.next);

        System.out.println((isSequence ? "They " : "They don't ") + "have the same sequence");
    }
}
