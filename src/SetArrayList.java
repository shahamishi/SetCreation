import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SetArrayList<E> implements SetInterface{

	List<E> set;
	
	public SetArrayList(){
		set = new ArrayList<E>();
	}
	
	public int size(){
		return set.size();
	}
	
	public boolean add(E value){
		boolean valueAdded=false;
		if(!set.contains(value)){
			set.add(value);
			valueAdded=true;
		}
		return valueAdded;
	}
	
	public boolean add(Collection<E> values){
		boolean valueAdded=false;
		for(E value:values){
			if(!set.contains(value)){
				set.add(value);
				valueAdded=true;
			}
		}
		
		return valueAdded;
	}
	
	public boolean remove(E value){
		boolean valueRemoved=false;
		if(set.contains(value)){
			set.remove(value);
			valueRemoved=true;
		}
		return valueRemoved;
	}
	
	public boolean removeAll(Collection<E> values){
		boolean valueRemoved=false;
		for(E value:values){
			if(set.contains(value)){
				set.remove(value);
				valueRemoved=true;
			}
		}
		return valueRemoved;
	}
	
	
	public boolean contains(E value){
		return set.contains(value);
	}
	
}
