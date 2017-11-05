package Lab;

public class p03_Scale<T extends Comparable<T>> {
	
	private T left;
	private T right;
	
	public p03_Scale(T left, T right) {
		this.left = left;
		this.right = right;
	}
	
	public T getHeavier() {
		int returnCode = this.left.compareTo(this.right);
		
		if (returnCode < 0)
			return this.right;
		else if (returnCode > 0) 
			return this.left;
		else
			return null;
	}
	
	
	public static void main(String[] args) {
		p03_Scale<Integer> nums = new p03_Scale<>(5, 6);
		System.out.println(nums.getHeavier());
		
		p03_Scale<Integer> nums1 = new p03_Scale<>(7, 6);
		System.out.println(nums1.getHeavier());
		
		p03_Scale<Integer> nums2 = new p03_Scale<>(5, 5);
		System.out.println(nums2.getHeavier());
	}
}
