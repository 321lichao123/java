class Demo3 {
	public static void main(String[] args) {
		Person p1 = new Person("����", 24);
		System.out.println(p1.getName()+ "....." + p1.getAge());

		System.out.println("====================================");
		
		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(25);
		System.out.println(p1.getName()+ "....." + p1.getAge());
	}
}

/*
	���췽��
		�����Գ�ʼ��
	setXXX����
		�޸�����ֵ
	�Ƽ�ʹ��setXXX�����Ƚ����
*/

class Person {
	private String name;
	private int age;

	public Person(){}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}