package org.example;

public class MergeTwoLists {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        MergeTwoLists solution = new MergeTwoLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        printList(mergedList);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);

        }
        return result;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

