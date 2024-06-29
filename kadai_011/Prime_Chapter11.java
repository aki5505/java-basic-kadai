package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {

		boolean flag[] = new boolean[101];

		for (int l = 1; l < flag.length; l++) {
			flag[l] = true;
		}

		for (int i = 2; i <= flag.length; i++) {

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag[i] = false;
					break;
				}
			}
		}
		for (int n = 2; n < flag.length; n++) {
			if (flag[n]) {
				System.out.println(n);

			}
		}

	}

}
