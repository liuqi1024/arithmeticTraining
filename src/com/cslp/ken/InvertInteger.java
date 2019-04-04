package com.cslp.ken;

public class InvertInteger {

	public int inverse(int x) {
		int pop = 0;
		int rev = 0;
		while (x != 0) {
			pop = x % 10;
			x /= 10;
			
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE && pop > 7)) return 0;
			if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && pop < -8)) return 0;
			
			rev = rev * 10 + pop;
		}
		return rev;
	}

	public int invertByString(int xx) {
		int x = 0;
		if (xx < 0) {
			x = -xx;
		} else {
			x = xx;
		}
		Integer originInteger = new Integer(x);
		String strInteger = originInteger.toString();
		StringBuilder strBuilderReverse = new StringBuilder(strInteger).reverse();
		String strReverse = strBuilderReverse.toString();
		int iRerverse;
		try {
			iRerverse = Integer.parseInt(strReverse);
		} catch (NumberFormatException e) {
			return 0;
		}
		if (xx < 0) {
			return -iRerverse;
		} else {
			return iRerverse;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 153423229;
		InvertInteger invertInteger = new InvertInteger();
		System.out.println("origin number is: " + i);
		System.out.println("reverse number is: " + invertInteger.inverse(i));
	}

}
