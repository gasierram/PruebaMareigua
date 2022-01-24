public class MyClass {
	public static void main(String[] args) {
		String str = "mareigua";
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
	}
}