class Demo4 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		/*
			������󴴽����裺
				Student s = new Student();
				1��Student.class���ؽ��ڴ�
				2������һ��Student��������
				3���ڶ��ڴ洴������
				4��������������Ĭ�ϳ�ʼֵ
				5�����Խ�����ʾ��ʼ��
				6�����췽����ջ���Զ��������Ը�ֵ�����췽����ջ
				7��������ĵ�ֵַ��ֵ��s
		*/
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "zhangsan";
	private int age = 23;

	public Student() {
		name = "����";
		age = 24;
	}

	public void show() {
		System.out.println(name + "  "+ age);
	}

}
