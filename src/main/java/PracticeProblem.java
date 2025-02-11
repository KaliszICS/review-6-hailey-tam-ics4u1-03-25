public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sum(2,3));
		System.out.println(difference(2,3));
		System.out.println(product(2,3));
		System.out.println(isEven(0));
		System.out.println(isOdd(0));

	}
	public static int sum (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int difference (int num3, int num4) {
		int result2 = num3 - num4;
		return result2;
	}

	public static double product (double num5, double num6) {
		double result3 = num5*num6;
		return result3;
	}

	public static String removeFirst(String word) {
		String result4 = word.substring(1);
		return result4;
	}

	public static int combinedLength (String word2, String word3) {
		int result5 = word2.length() + word3.length();
		return result5;
	}

	public static boolean isEven (int num7) {
		boolean result6;
		if (num7%2 == 0){
			result6 = true;
		}
		else
		result6 = false;
		return result6;
	}

	public static boolean isOdd (int num8) {
		boolean result7;
		if (num8%2 == 0){
			result7 = false;
		}
		else
		result7 = true;
		return result7;
	}

	public static boolean isPositive (int num9) {
		boolean result8;
		if (num9 > 0) {
			result8 = true;
		}
		else
		result8 = false;
		return result8;
	}

	public static boolean isNegative (int num10) {
		boolean result9;
		if (num10 < 0) {
			result9 = true;
		}
		else
		result9 = false;
		return result9;
	}
}
