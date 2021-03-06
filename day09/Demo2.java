class Demo2 {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.num);  // 10

		Father f1 = new Son();
		f1.print();

		Father f2 = new Son();
		f2.method();
	}
}
/*
	成员变量
		编译看左边(父类)，运行看左边(父类)
	成员方法
		编译看左边（父类），运行看右边（子类） 动态绑定
	静态方法
		编译看左边（父类），运行看右边（父类）
*/

class Father {
	int num = 10;
	public void print() {
		System.out.println("Father");
	}
	public static void method() {
		System.out.println("Father static method");
	}
}

class Son extends Father {
	int num = 20;
	public void print() {
		System.out.println("Son");
	}
	public static void method() {
		System.out.println("Son static method");
	}
}
