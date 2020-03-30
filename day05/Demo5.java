class Demo5 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		/**
			ArrayIndexOutOfBoundsException: 数组索引越界异常
				原因：访问的数组的索引不存在
			NullPointerException: 空指针
				原因：数组名已经不指向堆内存了，而继续使用数组名访问元素
		*/
		int[] arr1 = new int[5];
		System.out.println(arr1[4]);
//		System.out.println(arr1[5]);  // ArrayIndexOutOfBoundsException
		arr1 = null;
		System.out.println(arr1[0]);  // 当数组引用赋值为null，再调用数组中的元素就会出现NullPointerException
	}
}
