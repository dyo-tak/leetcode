/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(-1);
        ListNode firstNode = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }

        mergedList.next = (list1 == null) ? list2 : list1;
        return firstNode.next;
    }
}

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode mergedList = new ListNode(0);
//         ListNode firstNode = new ListNode(0);

//         if (list1.val < list2.val) {
//             mergedList = list1;
//             list1 = list1.next;
//         } else {
//             mergedList = list2;
//             list2 = list2.next;
//         }

//         firstNode = mergedList;

//         while (mergedList != null) {
//             if (list1.val < list2.val) {
//                 mergedList.next = list1;
//                 list1 = list1.next;
//             } else {
//                 mergedList.next = list2;
//                 list2 = list2.next;
//             }

//             mergedList = mergedList.next;
//         }

//         return firstNode;
//     }
// }

public class mergeTwoSortedLists {
    public static void main(String[] args) {

    }

}
