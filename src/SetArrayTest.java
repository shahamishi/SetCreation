import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ashah on 5/2/16.
 */
public class SetArrayTest {
    @Test
    public void getNonNullSetTest() {
        assertNotNull(new SetArrayImpl());
    }
    @Test
    public void getEmptySetTest() {
        assertEquals(0, new SetArrayImpl().size());
    }

    @Test
    public void addIntegerToSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        assertTrue(setArray.add(1));
        assertEquals(1, setArray.size());

    }

    @Test
    public void addMultipleIntegerToSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        setArray.add(2);
        setArray.add(3);
        setArray.add(4);
        setArray.add(5);
        setArray.add(6);
        setArray.add(7);
        assertEquals(7, setArray.size());
    }

    @Test
    public void addCollectionOfIntegerToSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        Collection<Integer> integerCollection = new ArrayList<Integer>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
        integerCollection.add(5);
        integerCollection.add(6);
        assertTrue(setArray.addAll(integerCollection));
    }

    @Test
    public void addDuplicateIntgerToSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        assertFalse(setArray.add(1));
    }

    @Test
    public void addCollectionOfDuplicateIntegerToSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        Collection<Integer> integerCollection = new ArrayList<Integer>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(2);
        setArray.addAll(integerCollection);
        assertEquals(2, setArray.size());
    }

    @Test
    public void removeIntegerFromSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        setArray.add(2);
        setArray.add(3);
        assertTrue(setArray.remove(1));
        assertEquals(2, setArray.size());
    }

    @Test
    public void removeCollectionOfIntegerFromSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        Collection<Integer> integerCollection = new ArrayList<Integer>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
        setArray.addAll(integerCollection);
        Collection<Integer> removalSet = new ArrayList<Integer>();
        removalSet.add(1);
        removalSet.add(3);
        assertTrue(setArray.removeAll(removalSet));
        assertEquals(2, setArray.size());
    }

    @Test
    public void removeNonExistentIntegerValueFromSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        assertFalse(setArray.remove(2));
    }

    @Test
    public void removeNonExistentIntegerCollectionFromSetTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        Collection<Integer> integerCollection = new ArrayList<Integer>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
        setArray.addAll(integerCollection);
        Collection<Integer> removalSet = new ArrayList<Integer>();
        removalSet.add(5);
        removalSet.add(3);
        assertTrue(setArray.removeAll(removalSet));
        assertEquals(3, setArray.size());
    }

    @Test
    public void containsIntegerValueTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        assertTrue(setArray.contains(1));
    }

    @Test
    public void containsIntegerValueFalseTest() {
        SetArrayImpl setArray = new SetArrayImpl();
        setArray.add(1);
        assertFalse(setArray.contains(2));
    }
}
