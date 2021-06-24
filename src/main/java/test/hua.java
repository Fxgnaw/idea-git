package test;

import java.util.Deque;
import java.util.LinkedList;

public class hua {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.getFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return res;
    }
}
