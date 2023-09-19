
public class today03 {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 15, d = 0;

		System.out.println(++a - 5);
		System.out.println(b++ - 5);
		System.out.println(a);
		System.out.println(b);

		int b1 = (5 < 4) ? 50 : 40;
		System.out.println(b1);

		int b2 = 0;
		if (5 < 4) {
			b2 = 50;
		} else {
			b2 = 40;
		}
		System.out.println(b2);
	}

}
