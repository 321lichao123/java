
/*
	基本数据类型的值传递，不改变原值，因为调用后就会弹栈，局部变量随之消失
	引用数据类型的只传递，改变原值，因为即使方法弹栈，但是退内存数组对象还存在，可以通过地址继续访问

	Java中到底是传值还是传址
	1、即是传值也是传址，基本数据类型是传值，引用类型是传址
	2、java中只有传值，因为地址值也是值（java之父支持）
*/ 
class Demo13 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ",b = " + b);
		change(a, b);
		System.out.println("a = " + a + ",b = " + b);

		int[] arr = {1, 2, 3, 4, 5};
		change(arr);
		System.out.println(arr[1]);
	}
	public static void change(int a, int b) {
		System.out.println("a = " + a + ",b = " + b);
		a = b;
		b = a + b;
		System.out.println("a = " + a + ",b = " + b);
	}
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0){
				arr[i] *= 2;
			}
		}
	}
}
