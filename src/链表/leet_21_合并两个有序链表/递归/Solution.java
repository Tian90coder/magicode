package 链表.leet_21_合并两个有序链表.递归;

import commons.ListNode;

/**
 * @author: theTian
 * @date: 2020/9/29 11:36
 */
public class Solution {
    /**
     * 递归连接两个有序链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2); // l1.next -> mergeTwoLists(l1.next, l2)
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}
