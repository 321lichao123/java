package com.heima.test;

import java.util.Arrays;

public class Test1 {
	/*
	 * 案例演示
	 * 需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
	 * */
	public static void main(String[] args) {
		String str = "91 27 46 38 50";
		String[] arr1 = str.split(" ");
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
		}
		
		Arrays.sort(arr2);
		// 拼接字符串
		/*缺点产生大量的垃圾字符串
		 * String str2 = ""; for (int i = 0; i < arr2.length; i++) { if (i ==
		 * arr2.length - 1) { str2 += arr2[i]; } else { str2 += arr2[i] + " "; } }
		 * 
		 * System.out.println(str2);
		 */
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length - 1) { 
				str2.append(arr2[i]); 
			} else { 
				str2.append(arr2[i] + " "); 
			}
		}
		System.out.println(str2);
	}

}
