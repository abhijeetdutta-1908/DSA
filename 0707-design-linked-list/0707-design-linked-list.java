class MyLinkedList {
    // Helper Node structure
    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        
        ListNode(int val) {
            this.val = val;
        }
    }

    private int size;
    private ListNode head;
    private ListNode tail;

    public MyLinkedList() {
        this.size = 0;
        // Initialize sentinel/dummy nodes
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        ListNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        
        // Find predecessor node
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode succ = pred.next;
        
        // Insert new node
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        
        // Find predecessor node
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        
        // Bypass the target node
        pred.next = succ;
        succ.prev = pred;
        
        size--;
    }
}
