public class Run {
	private int r;
	private int g;
	private int b;
	private int number; 
	public Run next;
	public Run prev;
	public Run() {
		r = -1;
		g = -1;
		b = -1;
		number = -1;
		next = null;
		prev = null;
	}
	public Run(int r, int g, int b) {
		this.r = -1;
		this.g = -1;
		this.b = -1;
		number = -1;
		next = null;
		prev = null;
	}
	public Run(int r, int g, int b, int number) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.number = number;
		next = null;
		prev = null;
	} 
	public int[] getRun() {
		int[] thisRun = new int[4];
		thisRun[0] = number;
		thisRun[1] = r;
		thisRun[2] = g;
		thisRun[3] = b;
		return thisRun;
	}
	public int getNum() {
		return number;
	}
	public void setNum(int num) {
		number = num;
	}
}