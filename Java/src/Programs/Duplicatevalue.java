package Programs;

public class Duplicatevalue {
	// program to print duplicate value and word from array
	public static void main(String[] args) {
	//	double [] arr = {1,3,1,4,5,2,6,4};
		String [] arr = {"Amazon","Google","Amazon"};

		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {

				if (arr[i]==arr[j]) {

					System.out.println(arr[i]);
				}
			}
		}

	}

}
