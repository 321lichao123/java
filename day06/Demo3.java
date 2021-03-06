class Demo3 {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 24);
		System.out.println(p1.getName()+ "....." + p1.getAge());

		System.out.println("====================================");
		
		Person p2 = new Person();
		p2.setName("张三");
		p2.setAge(25);
		System.out.println(p1.getName()+ "....." + p1.getAge());
	}
}

/*
	构造方法
		给属性初始化
	setXXX方法
		修改属性值
	推荐使用setXXX方法比较灵活
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