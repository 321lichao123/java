class Demo6 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int[] arr1 = new int[]{11, 22, 33, 44, 55};
		for (int i = 0; i < 5; i++ ){
			System.out.println(arr1[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		// length 表示数组的长度
		for (int i = 0; i < arr1.length; i++ ){
			System.out.println(arr1[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		// 将遍历封装成方法
		
		int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		print(arr2);
	}
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
