// (13). Write a java program to display palindrome prime numbers between 1 to 500.
class Main {
	public static void main(String args[]) {
		for (int i = 2; i <= 500; i++) {
			boolean check1 = prime(i);
			if (check1 == true) {
				boolean check2 = plaim(i);
				if (check2 == true) {
					System.out.println("" + i);
				}
			}
		}
		System.exit(0);
	}

	static boolean prime(int n) {
		int j;
		for (j = 1; j <= n; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean plaim(int n) {
		int pal = 0;
		int np = n;
		while (n > 0) {
			pal = pal * 10;
			pal = pal + (n % 10);
			n = n / 10;
		}
		if (pal == np) {
			return true;
		} else {
			return false;
		}
	}
}