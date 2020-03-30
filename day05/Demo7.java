class Demo7 {
	public static void main(String[] args) {
//		System.out.println("Hello World!"); 
	// 求数组的最大值和最小值
		int[] arr = new int[]{1, 6, 2, 8, 3, 9, 4, 5, 7};
		int max = getMax(arr);
		System.out.println(max);
		System.out.println("-----------------------------------------------");
		int min = getMin(arr);
		System.out.println(min);
	}
	// 获取最大值的方法
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++ ){
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	// 获取最小值的方法
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++ ){
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
