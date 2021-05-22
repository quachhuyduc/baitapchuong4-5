package chuong4;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, Double> treeMap = new TreeMap<Integer, Double>();
		treeMap.put(1, 9d);
		treeMap.put(4, 10.1d);
		treeMap.put(2, 7.2d);
		treeMap.put(8, 20.28d);
		System.out.println("cac phan tu co trong treeMap la:");
		Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
		System.out.println(setTreeMap);
	
		treeMap.replace(4, 20.11d);
		
		treeMap.replace(2, 7.2d, 7.7d);
		System.out.println("cac phan tu co trong treeMap sau khi thay the la:");
		setTreeMap = treeMap.entrySet();
		System.out.println(setTreeMap);

	}

}
