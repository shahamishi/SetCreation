import java.util.Collection;
import java.util.List;

/**
 * Created by ashah on 5/2/16.
 */
public class SetArrayImpl implements SetInterface {

    int[] set;

    int size;

    public SetArrayImpl(){
        size=0;
        set = new int[5];
    }

    public int size(){
        return size;
    }

    public boolean add(int value){
        boolean valueAdded=false;
        boolean found=false;

        if(size == set.length){
            increaseArraySize();
        }
        for(int i=0;i<size;i++){
            if(set[i]==value){
                found=true;
                break;
            }
        }
        if(!found){
            set[size++]=value;
            valueAdded=true;
        }
        return valueAdded;
    }

    public boolean addAll(Collection<Integer> values){
        boolean valueAdded=false;

        for(Integer value:values){
           valueAdded=add(value)||valueAdded ;
        }

        return valueAdded;
    }

    public boolean remove(int value){
        boolean valueRemoved=false;

        for(int i=0;i<size;i++){
            if(set[i]==value){
                set[i]=set[size-1];
                set[--size]=0;
                valueRemoved=true;
                break;
            }
        }

        return valueRemoved;
    }

    public boolean removeAll(Collection<Integer> values){
        boolean valueRemoved=false;

        for(Integer value:values){
            valueRemoved=remove(value)||valueRemoved ;
        }

        return valueRemoved;
    }

    public boolean contains(int value){
        boolean found=false;
        for(int i=0;i<size;i++){
            if(set[i]==value){
                found=true;
            }
        }
        return found;
    }

    private void increaseArraySize(){
        int[] tempSet = set;
        set = new int[set.length+5];
        for(int i=0;i<size;i++){
            set[i] = tempSet[i];
        }
    }


}
