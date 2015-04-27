public class Y extends X {
	int j;
	public static void main(String[] args) {
		X[] xa = new X[5];
		Y[] ya = new Y[5];
		xa[0] = new X();
		xa[1] = new Y();
		xa[2] = new Y();
		xa[3] = new Y();
		xa[4] = new Y();
		// ya = (Y[])xa;
		ya[0] = (Y)xa[0];		
		xa = ya;
	}
} 