package Fall_Demos;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array1 = {
				{90.1,80.2,15.4,17.7,10.15,25.1},
				{99.1,85.2,19.4,21.7,22.1,90.2},
				{94.1,55.2,38.4,71.7,76.1,44.2},
				{94.1,65.2,29.4,81.7,32.1,70.2}
		};
		double[][] array2 = {
				{90.1,80.2,15.4,17.7},
				{99.1,85.2,19.4,21.7,22.1,90.2},
				{94.1,55.2,38.4,76.1,44.2},
				{94.1,70.2}
		};
		
		ArraysDemo ad1 = new ArraysDemo(array1);
		System.out.println("Total ArrayDemos: " + ad1.getArrayDemoCount());
		ArraysDemo ad2 = new ArraysDemo(array2);

		System.out.println("Total ArrayDemos (ad1): " + ad1.getArrayDemoCount());

		System.out.println("Total ArrayDemos: (ad2)" + ad2.getArrayDemoCount());
		
		double[] result1;
		double[] result2;
		
		result1 = ad1.sumRows();
		result2 = ad2.sumRows();
		
		System.out.print("Row sums: ");
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}
		System.out.println();
		System.out.print("Row sums: ");
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println();

	}

}
