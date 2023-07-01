import java.util.*;
class BinaryStringPalindrome{
	static int INT_MAX = 2147483647;
	static int isKthBitSet(int x, int k)
	{
		return ((x & (1 << (k - 1))) > 0) ? 1 : 0;
	}
	static int leftmostSetBit(int x)
	{
		int count = 0;
		while (x > 0) {
			count++;
			x = x >> 1;
		}
		return count;
	}
	static int isBinPalindrome(int x)
	{
		int l = leftmostSetBit(x);
		int r = 1;
		while (l > r) {
			if (isKthBitSet(x, l) != isKthBitSet(x, r))
				return 0;
			l--;
			r++;
		}
		return 1;
	}

	static int findNthPalindrome(int n)
	{
		int pal_count = 0;
		int i = 0;
		for (i = 1; i <= INT_MAX; i++) {
			if (isBinPalindrome(i) > 0) {
				pal_count++;
			}

				if (pal_count == n)
				break;
		}

		return i;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();
		System.out.println("The nth Palindrome of "+n+" is "+findNthPalindrome(n));
	}
}
