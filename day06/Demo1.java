class Demo1 {
	public static void main(String[] args) {
// 		System.out.println("Hello World!");
		Person p = new Person();
		// p.Person()     ���췽������ʹ�ö������
	}
}
/*
			���췽������������
				����������ݣ����ԣ����г�ʼ��
			���췽����ʽ�ص�
				��������������ͬ
				û�з���ֵ������void��û��
				û�о���ķ���ֵreturn
		*/
class  Person {
	private String name;
	private int age;
	// ���췽��
	public Person() {
		System.out.println("Hello World!");
	}
}