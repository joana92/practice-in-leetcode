//need to be modified
public class Solution {
	public int countNodes(TreeNode root) {
		if (root == null) return 0;
		int h = 0;
		TreeNode curr = root;
		while (curr.left != null) {
			curr = curr.left;
			h++;
		}
		if (h == 0) return 1;
		int low = 1 << h, high = 1 << (h + 1);
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (valid(root, mid, h)) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low - 1;
	}
	private boolean valid(TreeNode root, int pos, int h) {
		TreeNode curr = root;
		for (int i = h - 1; i >= 0; i--) {
			if ((pos & (1 << i)) > 0) {
				curr = curr.right;
			} else {
				curr = curr.left;
			}
		}
		return curr != null;
	}
