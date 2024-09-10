package Medium;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
public class RandomizedSet {
    private HashMap<Integer,Integer> map;
    private List<Integer> list;
    private Random rand;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = map.get(val);
            // Get the last element in the list
            int lastElement = list.get(list.size() - 1);
            // Swap the element to remove with the last element
            list.set(index, lastElement);
            // Update the map for the new index of the last element
            map.put(lastElement, index);
            // Remove the last element from the list and the map
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}
