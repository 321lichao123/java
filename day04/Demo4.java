class Demo4 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		a: for (int i = 1; i <= 10; i++){     // a��b��ʾ��ʶ���Ը�break���ʹ�������Ͽ�ָ����ѭ��
			System.out.println("i=" + i);
			b: for (int j = 1; j <= 10; j++){
				System.out.println("j=" + j);
				if(j == 5) {
					break a;
				}
			}
		}
	}
}
