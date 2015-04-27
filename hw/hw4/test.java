import list.*;
public class test {
    public static void main(String[] args) {
    LockDList dList = new LockDList();
    dList.insertFront(5);
    dList.insertBack(4);
    System.out.println(dList.front().item);
    System.out.println(dList.back().item);
    DListNode dl = dList.front();
    dList.insertAfter(7, dl);
    dList.insertBefore(3, dl);
    
    dList.lockNode(dl);
    System.out.println(dList);
    dList.remove(dList.next(dl));
    System.out.println(dList);
    dList.remove(dList.next(dl));
    System.out.println(dList);
    dList.remove(dList.next(dl));
    System.out.println(dList);
    dList.remove(dList.next(dl));
    System.out.println(dList);
    dList.remove(dList.next(dl));
    System.out.println(dList);

  }
}
