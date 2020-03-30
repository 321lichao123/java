class Demo_ArrayTool {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int[] arr = {11, 22, 66, 55, 44};
		ArrayTool at = new ArrayTool();
		int max = at.getMax(arr);
		System.out.println(max);
		System.out.println("----------------------");
		at.print(arr);
		System.out.println("----------------------");
		at.revArray(arr);
		at.print(arr);
	}
}
