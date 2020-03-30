class Demo12 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 40, 60}, {99, 100, 120}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++ ){
			for (int j = 0; j < arr[i].length; j++){
				sum = sum + arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
