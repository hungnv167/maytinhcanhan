package com.maytinh;

import java.io.InputStream;
import java.util.Scanner;

public class Maytinhcanhan implements Maytinh {

	@Override
	public Integer Cong2So(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	@Override
	public Integer Tru2So(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

	@Override
	public Integer ChiaLayNguyen2So(int number1, int number2) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			result = number1 / number2;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Không thể chia cho số 0");
		}
		return result;
	}

	@Override
	public Integer ChiaLayDu2So(int number1, int number2) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			result = number1 % number2;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Không thể chia cho số 0");
		}
		return result;
	}

	@Override
	public Integer Nhan2So(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}

	@Override
	public float ChiaLayThapPhan2So(int number1, int number2) {
		// TODO Auto-generated method stub
		float result = 0;
		try {
			result = (float) number1 / number2;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Không thể chia cho số 0");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maytinhcanhan Maytinh = new Maytinhcanhan();
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		System.out.println("Nhập giá trị thứ nhất:");
		int number1 = scanner.nextInt();
		System.out.println("Nhập giá trị thứ hai:");
		int number2 = scanner.nextInt();
		System.out.println("Nhập phép toán muốn tính (+ , -, *, /, %, f): ");
		String toantu = scanner.next();
		System.out.println("=======================================================");
		switch (toantu) {
		case "+":
			System.out.println("Tổng của hai số đã nhập là: " + Maytinh.Cong2So(number1, number2));
			break;
		case "-":
			System.out.println("Hiệu của hai số đã nhập là: " + Maytinh.Tru2So(number1, number2));
			break;
		case "*":
			System.out.println("Tích của hai số đã nhập là: " + Maytinh.Nhan2So(number1, number2));
			break;
		case "/":
			System.out.println("Phép chia phần nguyên của hai số đã nhập là: " + Maytinh.ChiaLayNguyen2So(number1, number2));
			break;
		case "%":
			System.out.println("Phép chia lấy phần dư của hai số đã nhập là: " + Maytinh.ChiaLayDu2So(number1, number2));
			break;
		case "f":
			System.out.println("Phép chia 2 số có thập phân là: " + Maytinh.ChiaLayThapPhan2So(number1, number2));
			break;
		default:
			System.out.println("Phép toán bạn nhập không tồn tại");
			break;
		}
		scanner.close();
	}

}
