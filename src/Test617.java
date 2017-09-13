/**
 * 合并二叉树
 *
 * @Author mizes
 * @Create 2017-09-07 10:50
 */
public class Test617 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNodeO = new TreeNode(1);
        TreeNode treeNode11 = new TreeNode(2);
        TreeNode treeNode12 = new TreeNode(3);
        TreeNode treeNode13 = new TreeNode(4);
        TreeNode treeNode14 = new TreeNode(5);
        TreeNode treeNode15 = new TreeNode(6);
        TreeNode treeNode16 = new TreeNode(7);


        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        treeNodeO.left = treeNode11;
        treeNodeO.right = treeNode12;
        treeNode11.left = treeNode13;
        treeNode12.right = treeNode14;
        treeNode13.left = treeNode15;
        treeNode14.left = treeNode16;

        S617.mergeTrees(treeNode, treeNodeO);
        new Test617().showTree(treeNode);
    }


    public void showTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        showTree(root.left);
        showTree(root.right);
    }

}

class S617 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return t1;
        }
        else if (t1 != null && t2 == null) {
            return t1;
        }
        else if (t1 == null && t2 != null) {
            t1 = new TreeNode(t2.val);
        }
        else if (t1 != null && t2 != null) {
            t1.val += t2.val;
        }
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}