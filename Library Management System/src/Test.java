public class Test {

	public static void main(String[] args) {
//		String[] arr = {"", "", "C", "D","", "", "E", "F"};
//		Test test = new Test();
//		test.normalList(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.printf("%n========== \t%s\t ==========","LIBRARY MANAGEMENT SYSTEM");
		System.out.printf("%n========== \t\t%s\t\t\t ==========","Main Sub-Menu");
	}

	void normalList(String[] arr) {
		int start=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			if (!arr[i].isEmpty()) {
				arr[start++] = arr[i];
				arr[i]="";
			}
			while(!arr[start].isEmpty()){start++;}
		}
	}
}
