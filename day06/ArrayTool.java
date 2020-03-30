class ArrayTool {
	// 如果一个类中所有的方法都是静态的，那么需要添加一个私有构造方法,目的是不让其他类创建本类对象，直接用类名.调用即可
	private ArrayTool() {}
	// 获取最大值
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++ ){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}

	// 数组遍历
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++ ){
			System.out.println(arr[i] + "");
		}
	}
	// 数组反转
	public static void revArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++ ){
			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}
	}
}
