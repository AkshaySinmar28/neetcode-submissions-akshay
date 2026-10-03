/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int inIdx = 0;
        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            TreeNode parent = stack.peek();

            // If top of stack is NOT inorder[inIdx],
            // attach as left child
            if (parent.val != inorder[inIdx]) {
                parent.left = node;
            } 
            // Otherwise, backtrack until mismatch
            else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inIdx]) {
                    parent = stack.pop();
                    inIdx++;
                }
                parent.right = node;
            }

            stack.push(node);
        }

        return root;
    }
}
