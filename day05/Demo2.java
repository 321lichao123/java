class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		// 动态初始化数组
		int[] arr = new int[5];
		/*
			整数类型：byte、short、int、long默认初始化值都是0
			浮点类型：float、double默认初始化值都是0.0
			字符类型：char默认初始化值'\u0000' char在内存中占两个字节是16个二进制\u0000每一个0其实代表的是16进制的0，那么四个0就是代表16个二进制位
		*/
		System.out.println(arr);  // [I@79f1e0e0   有[ 就代表几维数组 I代表int类型 79f1e0e0代表数组的地址

	}
}
