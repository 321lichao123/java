package com.heima.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * A:������ʾ
		 * ����ģ���¼,�����λ���,����ʾ���м��Ρ�
		 * �û��������붼��admin
		 * */
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�������û���");
			String userName = sc.nextLine();
			System.out.println("����������");
			String userPassword = sc.nextLine();
			if ("admin".equals(userName) && "admin".equals(userPassword)) {
				System.out.println("��ӭ" + userName + "��¼");
				break;
			} else {
//				System.out.println("�û��������������");
				if (i == 2) {
					System.out.println("��Ĵ����Ѿ����꣬����������");
				} else {
					System.out.println("¼�����������" + (2 - i) + "����");
				}
			}
		}
	}

}
