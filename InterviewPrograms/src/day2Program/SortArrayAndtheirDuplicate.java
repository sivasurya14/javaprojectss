package day2Program;

public class SortArrayAndtheirDuplicate {

	public static void main(String[] args) {

		int arr[] = { 20, 8, 8, 10, 10, 30, 40, 12, 11, 8, 9,9 };
		
		System.out.println("Elements before : ");
		int temp,count = 0;
		int n = arr.length;
		int[] resultArray = new int[n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			resultArray[i] = arr[i];
		}
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Duplicate Elelments: ");
		for (int i = 1; i < resultArray.length; i++) {
			if (i < resultArray.length - 1 && resultArray[i] == resultArray[i + 1]) {

				System.out.print(resultArray[i] + " ");
				count++;
			}
		}
		System.out.println("\n");
        System.out.println("Count of the Duplicate Elelments : "+count);
	}
}
