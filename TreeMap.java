package chuong4;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap {

	public static void main(String[] args) {
     TreeMap<Integer, Character> treeMap = new TreeMap<Integer, Character>();
		
		treeMap.put(6, 'A');
		treeMap.put(5, 'B');
		treeMap.put(1, 'C');
		treeMap.put(2, 'D');
		treeMap.put(8, 'E');
	
		Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
		
		System.out.println("Cac entry co trong setTreeMap la:");
		System.out.println(setTreeMap);

	}

}



