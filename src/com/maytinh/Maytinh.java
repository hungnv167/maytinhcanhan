package com.maytinh;


public interface Maytinh {
	/**
	 * @param number1
	 * @param number2
	 * @return tổng 2 số
	 */
	public Integer Cong2So(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return hiệu 2 số
	 */
	public Integer Tru2So(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return phép chia 2 số lấy phần nguyên
	 */
	public Integer ChiaLayNguyen2So(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return phép chia 2 số lấy phần dư
	 */
	public Integer ChiaLayDu2So(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return tích 2 số
	 */
	public Integer Nhan2So(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return phép chia 2 số lấy cả phần thập phân
	 */
	public float ChiaLayThapPhan2So(int number1, int number2);
}
