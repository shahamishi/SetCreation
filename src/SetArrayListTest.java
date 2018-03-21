import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;



public class SetArrayListTest {

	@Test
	public void getNonNullSetTest() {
		assertNotNull(new SetArrayList<Integer>());
	}
	@Test
	public void getEmptySetTest() {
		assertEquals(0,new SetArrayList<Integer>().size());
	}
	
	
	@Test
	public void addIntegerToSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		assertTrue(setArrayList.add(1));
	}
	@Test
	public void addStringToSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		assertTrue(setArrayList.add("Amishi"));
	}
	
	
	@Test
	public void addMultipleIntegerToSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		setArrayList.add(2);
		assertEquals(2, setArrayList.size());
	}
	@Test
	public void addMultipleStringToSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		setArrayList.add("Swapnil");
		assertEquals(2, setArrayList.size());
	}
	
	@Test
	public void addCollectionOfIntegerToSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		Collection<Integer> integerCollection = new ArrayList<Integer>();
		integerCollection.add(1);
		integerCollection.add(2);
		assertTrue(setArrayList.add(integerCollection));
	}
	@Test
	public void addCollectionOfStringToSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		Collection<String> integerCollection = new ArrayList<String>();
		integerCollection.add("Amishi");
		integerCollection.add("Swapnil");
		assertTrue(setArrayList.add(integerCollection));
	}
	
	@Test
	public void addDuplicateIntgerToSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		assertFalse(setArrayList.add(1));
	}
	@Test
	public void addDuplicateStringToSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		assertFalse(setArrayList.add("Amishi"));
	}
	
	@Test
	public void addCollectionOfDuplicateIntegerToSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		Collection<Integer> integerCollection = new ArrayList<Integer>();
		integerCollection.add(1);
		integerCollection.add(2);
		integerCollection.add(2);
		setArrayList.add(integerCollection);
		assertEquals(2, setArrayList.size());
	}
	@Test
	public void addCollectionOfDuplicateStringsToSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		Collection<String> integerCollection = new ArrayList<String>();
		integerCollection.add("Amishi");
		integerCollection.add("Shah");
		integerCollection.add("Swapnil");
		integerCollection.add("Zilpelwar");
		integerCollection.add("Amishi");
		integerCollection.add("Swapnil");
		integerCollection.add("Amishi-2");
		setArrayList.add(integerCollection);
		assertEquals(5, setArrayList.size());
	}
	
	
	@Test
	public void removeIntegerFromSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		assertTrue(setArrayList.remove(1));
	}
	@Test
	public void removeStringFromSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		assertTrue(setArrayList.remove("Amishi"));
	}
	
	
	@Test
	public void removeCollectionOfIntegerFromSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		setArrayList.add(2);
		setArrayList.add(3);
		setArrayList.add(4);
		Collection<Integer> removalSet = new ArrayList<Integer>();
		removalSet.add(1);
		removalSet.add(3);
		assertTrue(setArrayList.removeAll(removalSet));
		assertEquals(2, setArrayList.size());
	}
	@Test
	public void removeCollectionOfStringFromSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		setArrayList.add("Shah");
		setArrayList.add("Swapnil");
		setArrayList.add("Zilpelwar");
		Collection<String> removalSet = new ArrayList<String>();
		removalSet.add("Amishi");
		removalSet.add("Shah");
		assertTrue(setArrayList.removeAll(removalSet));
		assertEquals(2, setArrayList.size());
	}
	
	@Test
	public void removeNonExistentIntegerValueFromSetTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		assertFalse(setArrayList.remove(2));
	}
	@Test
	public void removeNonExistentStringValueFromSetTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		assertFalse(setArrayList.remove("Swapnil"));
	}
	
	
	@Test
	public void containsIntegerValueTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		assertTrue(setArrayList.contains(1));
	}
	@Test
	public void containsStringValueTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		assertTrue(setArrayList.contains("Amishi"));
	}
	
	
	@Test
	public void containsIntegerValueFalseTest() {
		SetArrayList<Integer> setArrayList = new SetArrayList<Integer>();
		setArrayList.add(1);
		assertFalse(setArrayList.contains(2));
	}
	@Test
	public void containsStringValueFalseTest() {
		SetArrayList<String> setArrayList = new SetArrayList<String>();
		setArrayList.add("Amishi");
		assertFalse(setArrayList.contains("Swapnil"));
	}
	
	
}
