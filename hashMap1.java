package chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashMap1 {

	public static void main(String[] args) {
		HashMap<String, String> hashMapCity = new HashMap<>();
		hashMapCity.put("QNg", "Quang Ngai");
		hashMapCity.put("QN", "Quang Nam");
		
		hashMapCity.put("QN", "Quang Ninh");
		hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");
		System.out.println("danh sach cac thanh pho trong HashMapCity la:");
		Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
		System.out.println(setCity);
		
		System.out.println("QNg: " + hashMapCity.get("QNg") );
		
		System.out.println("NT:" + hashMapCity.get("NT"));
	
		if(hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
			System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");

	}

}
}
