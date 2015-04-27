package list;
public class LockDListNode extends DlistNode {
	private boolean isLocked = false;
	LockDListNode(Object i, LockDlistNode p, LockDlistNode n) {
		super(i, p, n);
	}
	protected void setLock() {
		isLocked = true;
	}
	protected boolean isLock() {
		return isLocked;
	}
}