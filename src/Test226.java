

/**
 * Created by mizeshuang on 2016/7/22.
 */
public class Test226 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(7);
        treeNode.left = treeNode1;
        //treeNode.right = treeNode2;
        //treeNode1.left = treeNode3;
        //treeNode1.right = treeNode4;
        //treeNode2.left = treeNode5;
        //treeNode2.right = treeNode6;
        new Test226().invertTree(treeNode);
        new Test226().showTree(treeNode);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
