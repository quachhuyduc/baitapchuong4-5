package chuong4;
import java.util.Scanner;
import java.util.ArrayList;
public class Max {

	public static void main(String[] args) {
		ArrayList<Integer> arrListInteger = new ArrayList<>(); 
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("nhap so phan tu cua ArrayList:");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("nhap phan tu thu " + i + ": ");
			number = scanner.nextInt();
			arrListInteger.add(number);
		}
	
		int max = arrListInteger.get(0);
		int min = arrListInteger.get(0);
		for(int i = 1; i < arrListInteger.size(); i++) {
			
			if(arrListInteger.get(i).compareTo(max) > 0) {
				max = arrListInteger.get(i);
			}
		}
		for(int i = 1; i < arrListInteger.size(); i++) {
			if(arrListInteger.get(i).compareTo(min)<0) {
				min = arrListInteger.get(i);
			}
		}
		System.out.println("phan tu lon nhat trong arrListInteger la:" + max);
		System.out.println("phan tu nho nhat trong arrListInteger la:" + min);

	}

}
