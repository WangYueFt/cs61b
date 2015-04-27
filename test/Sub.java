class Sub extends Super {
	// int x = 4;
	int g() {
		return super.x;
	}
	// int f() {
	// 	return 4;
	// }
	public static void main(String[] args) {
		Super supe = new Super();
		Sub sub = new Sub();
		System.out.println(supe.f());
		System.out.println(sub.f());
		int i =((Sub) supe).g();
		// System.out.println(((Sub) supe).g());
		// System.out.println(((Sub) supe).f());
	}
}
