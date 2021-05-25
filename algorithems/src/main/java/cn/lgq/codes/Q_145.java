package cn.lgq.codes;

import cn.lgq.beanfactory.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lgq
 * @Description 二叉树的后序遍历 按照访问左子树——右子树——根节点的方式遍历这棵树
 * 给定一个二叉树，返回它的 后序 遍历
 * 题解: 迭代
 * @create 2021-05-25 22:24
 */
public class Q_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == node){
                res.add(root.val);
                node = root;
                root = null;
            }else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
