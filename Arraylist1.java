package chuong4;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrListInteger = new ArrayList<>();
		arrListInteger.add(0);
		arrListInteger.add(8);
		arrListInteger.add(9);
		arrListInteger.add(1);
		System.out.println("cac phan tu co trong arrListInterger la: ");
		for (int number : arrListInteger) {
			System.out.println(number + "\t");

	}

}
