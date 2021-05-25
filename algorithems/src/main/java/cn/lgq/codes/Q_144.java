package cn.lgq.codes;

import cn.lgq.beanfactory.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lgq
 * @Description 二叉树的前序遍历 按照访问根节点——左子树——右子树的方式遍历这棵树
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 * PS:
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * 题解:
 * 用迭代的方式实现方法一的递归函数，两种方式是等价的，区别在于递归的时候隐式地维护了一个栈，而我们在迭代的时候需要显式地将这个栈模拟出来，其余的实现与细节都相同，
 * 具体可以参考下面的代码。
 * @create 2021-05-25 22:07
 */
public class Q_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (null != node) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
