package cn.lgq.beanfactory;

/**
 * @author lgq
 * @Description
 * @create 2021-05-25 20:58
 */
public class TreeNode {
    public   int val;
    public   TreeNode left;
    public   TreeNode right;
    public   TreeNode() {}
    public   TreeNode(int val) { this.val = val; }
    public   TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
