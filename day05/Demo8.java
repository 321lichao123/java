class Demo8 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};
		reverseArray(arr);
		print(arr);
	}
	// 数组反转
	public static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++ ){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	} 
	// 打印数组
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
