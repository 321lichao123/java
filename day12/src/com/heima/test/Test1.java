package com.heima.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * A:案例演示
		 * 需求：模拟登录,给三次机会,并提示还有几次。
		 * 用户名和密码都是admin
		 * */
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名");
			String userName = sc.nextLine();
			System.out.println("请输入密码");
			String userPassword = sc.nextLine();
			if ("admin".equals(userName) && "admin".equals(userPassword)) {
				System.out.println("欢迎" + userName + "登录");
				break;
			} else {
//				System.out.println("用户名或者密码错误");
				if (i == 2) {
					System.out.println("你的次数已经用完，请明天再来");
				} else {
					System.out.println("录入错误，您还有" + (2 - i) + "机会");
				}
			}
		}
	}

}
