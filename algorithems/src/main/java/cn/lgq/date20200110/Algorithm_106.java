package cn.lgq.date20200110;

/**
 * @author lgq
 * @Description 160. 相交链表
 * <P> 编写一个程序，找到两个单链表相交的起始节点。
 * @create 2021-01-10 22:48
 */
public class Algorithm_106 {
    /**
     * leetcode提供的数据类型
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @Description 解题思路:
     * <P>要求时间复杂度为 O(N)，空间复杂度为 O(1)。如果不存在交点则返回 null。
     *
     * <P>设 A 的长度为 a + c，B 的长度为 b + c，其中 c 为尾部公共部分长度，可知 a + c + b = b + c + a。
     *
     * <P>当访问 A 链表的指针访问到链表尾部时，令它从链表 B 的头部开始访问链表 B；同样地，当访问 B 链表的指针访问到链表尾部时，令它从链表 A 的头部开始访问链表 A。这样就能控制访问 A 和 B 两个链表的指针能同时访问到交点。
     *
     * <P>如果不存在交点，那么 a + b = b + a，以下实现代码中 l1 和 l2 会同时为 null，从而退出循环。
     * @param headA
     * @param headB
     */
    public static ListNode answer(ListNode headA,ListNode headB){
        ListNode A = headA;
        ListNode B = headB;
        while (A.val != B.val){
            A = (A == null) ? headB : A.next;
            B = (B == null) ? headA : B.next;
        }
        return A;
    }
    public static void main(String[] args) {
        //初始化A链
        ListNode A_1 = new ListNode(1);
        ListNode A_2 = new ListNode(3);
        ListNode A_3 = new ListNode(5);
        ListNode A_4 = new ListNode(7);
        ListNode A_5 = new ListNode(9);
        A_1.next = A_2;
        A_2.next = A_3;
        A_3.next = A_4;
        A_4.next = A_5.next;
        A_5.next = null;

        //初始化B链
        ListNode B_1 = new ListNode(2);
        ListNode B_2 = new ListNode(4);
        ListNode B_3 = new ListNode(6);
        ListNode B_4 = new ListNode(7);
        ListNode B_5 = new ListNode(8);

        B_1.next = B_2;
        B_2.next = B_3;
        B_3.next = B_4;
        B_4.next = B_5.next;
        B_5.next = null;

        System.out.println(answer(A_1,B_1).val);

    }

}
