class Demo5 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		/**
			ArrayIndexOutOfBoundsException: ��������Խ���쳣
				ԭ�򣺷��ʵ����������������
			NullPointerException: ��ָ��
				ԭ���������Ѿ���ָ����ڴ��ˣ�������ʹ������������Ԫ��
		*/
		int[] arr1 = new int[5];
		System.out.println(arr1[4]);
//		System.out.println(arr1[5]);  // ArrayIndexOutOfBoundsException
		arr1 = null;
		System.out.println(arr1[0]);  // ���������ø�ֵΪnull���ٵ��������е�Ԫ�ؾͻ����NullPointerException
	}
}
