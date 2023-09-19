
public class today01 {

	public static void main(String[] args) {
// String
		String str = new String("chicken");

		System.out.println(str.length());
		System.out.println(str.concat(" world"));

		str = str.concat(" world");

		System.out.println(str);

		str = str.concat(" good");

		System.out.println(str);

		str = str + " yeah";
		System.out.println(str);

// str += -> str = str +

		str += 'A';
		System.out.println(str);

		int num = 10;
		num *= 10;
		System.out.println(num);

	}

}