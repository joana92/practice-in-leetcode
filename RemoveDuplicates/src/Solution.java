
public class Solution {
	public static int removeDuplicates(int[] A) {
		if (A.length < 2)
			return A.length;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
			for(int ii=0;ii<A.length;ii++)
				System.out.print(A[ii]+"	");
			System.out.println("");
		}
	 
		return j + 1;
	}    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1,1,2,3,4,5};
        for (int i : nums) {
            System.out.format("%d ", i);
        }
        System.out.format("\nlen = %d\n", s.removeDuplicates(nums));
        for (int i : nums) {
            System.out.format("%d ", i);
        }
    }
}
