package com.heima.test;

public class Test5 {

	/**
	 * 案例演示
	* 需求：把数组中的数据按照指定个格式拼接成一个字符串
		* 举例：
			* int[] arr = {1,2,3};	
		* 输出结果：
			* "[1, 2, 3]"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i] + ", ";
			}
		}
		System.out.println(s);
	}

}
