package com.heima.test;

public class Test7 {

	/**
	 * 画图演示
	* 需求：统计大串中小串出现的次数
	* 这里的大串和小串可以自己根据情况给出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String max = "woaiheima,heimabutongbaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		String min = "heima";
		int count = 0;
		int index = 0;
		while((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
