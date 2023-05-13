package Programs;

public class Duplicateletter {

	public static void main(String[] args) {
		String str = "schools Buu"; int count = 0;
		char[] input = str.toCharArray(); //is used to convert the given string to character array 
		System.out.println("Duplicate Characters are:" );

		for (int i = 0; i < str.length(); i++)
		{
		for (int j = i + 1; j < str.length(); j++) {

		if (input[i]== input[j]) { 
		  System.out.println(input[j]);

		count++;
		break;

		}
			}
		}

	}

}
