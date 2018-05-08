package datastruct.list.dll;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {

    @Test
    public void testAddFirst() {
        DLinkedList<Integer> list = new DLinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(10);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("10:9:2:5:1", list.list());
        Assert.assertEquals(10, (int) list.getFirst());
    }

    @Test
    public void testAddLst() {
        DLinkedList<Integer> list = new DLinkedList<Integer>();
        list.addLast(1);
        list.addLast(5);
        list.addLast(2);
        list.addLast(9);
        list.addLast(10);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("1:5:2:9:10", list.list());
        Assert.assertEquals(10, (int) list.getLast());
    }


}
