package chuong4;
import java.util.HashSet;
import java.util.Scanner;

public class HashAdd {

	public static void main(String[] args) {
		int number;
		HashSet<Integer> hashSetInteger = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		hashSetInteger.add(0);
		hashSetInteger.add(1);
		hashSetInteger.add(2);
		hashSetInteger.add(3);
		hashSetInteger.add(4);
		hashSetInteger.add(5);
		hashSetInteger.add(6);
		hashSetInteger.add(7);
		hashSetInteger.add(8);
	
		System.out.println("cac phan tu trong hashSetInteger:");
		System.out.println(hashSetInteger);
		System.out.println("nhap phan tu can them:");
		number = sc.nextInt();
		//thêm 1 phần tử mới vào hashSetInteger từ bàn phím
		//nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại
		if(!hashSetInteger.contains(number)) {
			hashSetInteger.add(number);
			System.out.println("them thanh cong!");
			System.out.println("cac phan tu trong hashSetInteger sau khi thêm la:");
			System.out.println(hashSetInteger);
		}else {
			System.out.println("phan tu" + number + "da ton tai!");
		}

	}

}
