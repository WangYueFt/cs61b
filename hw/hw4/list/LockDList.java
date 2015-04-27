package list;
public class LockDList extends DList {
	public LockDList() {
		super();
	}
	protected LockDListNode newNode(Object item, LockDListNode prev, LockDListNode next) {
		return new LockDListNode(item, prev, next);
	}
	public void lockNode(DListNode node) { 
		node.setLock();
	}
	public void remove(DListNode node) {
    // Your solution here.
    if (node==null || node.isLock()) {
      return;
    } else {
    	super.remove(node);
    }
  }
}