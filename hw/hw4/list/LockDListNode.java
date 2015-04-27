package list;
public class LockDListNode extends DListNode {
	private boolean isLocked = false;
	LockDListNode(Object i, LockDListNode p, LockDListNode n) {
		super(i, p, n);
	}
	protected void setLock() {
		isLocked = true;
	}
	protected boolean isLock() {
		return isLocked;
	}
}