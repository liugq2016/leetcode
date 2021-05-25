package cn.lgq.codes;

import cn.lgq.beanfactory.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgq
 * @Description 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *      输入：root = [1,null,2,3]
 *      输出：[1,3,2]
 * PS:
 *      树中节点数目在范围 [0, 100] 内
 *      -100 <= Node.val <= 100
 *  题解：
 *      递归：
 * @create 2021-05-25 21:04
 */
public class Q_94 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (null == root){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
