package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseListTest {
    @Test
    public void ReverseListNodeTest() {
        ReverseList reverseList = new ReverseList();
        int[] head = {1, 2, 33, 7, 1};
        reverseList.init(head);
        int[] result = headToArray(reverseList.getHead());
        int[] reversedHead = {1, 7, 33, 2, 1};
        Assert.assertArrayEquals(reversedHead, result);
    }

    public static int[] headToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
