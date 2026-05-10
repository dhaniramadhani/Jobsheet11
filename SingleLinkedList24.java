public class SingleLinkedList24 {
    Node24 head;
    Node24 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node24 temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, Mahasiswa24 input) {
        Node24 temp = head;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                Node24 ndInput = new Node24(input, temp.next);
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa24 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Node24(input, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(String key) {
        Node24 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    Mahasiswa24 getDataByIndex(int index) {
        Node24 temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    int indexOf(String key) {
        Node24 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node24 temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
    }

    void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node24 temp = head;

        while (temp.next != null) {
            if (temp.next.data.nama.equalsIgnoreCase(key)) {

                if (temp.next == tail) {
                    tail = temp;
                }

                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node24 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}