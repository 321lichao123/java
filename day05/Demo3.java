class Demo3 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		/*
			栈：
				存储局部变量
					局部变量：定义在方法声明上和方法中的变量
			堆：
				存储new出来的数组或者对象
			方法区：
			本地方法区：
			寄存器：
				给CPU使用
		*/
		int[] arr = new int[3];
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		
	}
}
