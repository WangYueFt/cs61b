class C extends A implements B{
	public void hello(){
		System.out.println("I am a C class");
	}
	public static void main(String[] args) {
		System.out.println("I am in main");
		C c = new C();
		c.getClass().getSuperclass().getMethod("hello", new Class[]{}).invoke(c.getClass().getSuperclass().newInstance(), new Object[]{});
		//System.out.println(B.a);
		//A a = new A();
		//((C)a).hello();
		//C c = (C)(new A());
		// A a = (A)c;
		// a.hello();
		//c.hello();
	}
}
