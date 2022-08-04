package Fall_Demos;

public class ArraysDemo {

	private double heldArray[][];
	private static int AD_Count = 0;
	
	public ArraysDemo(double[][] startArray) {
		heldArray = startArray;
		AD_Count++;
	}
	public static int getArrayDemoCount() { return AD_Count; }
	
	public double[] sumRows() {
		double[] retArray;
		//retArray = new double[1];
		//retArray[0] = 0.0;
		double sum = 0.0;
		retArray = new double[heldArray.length];
		for (int i = 0; i < heldArray.length; i++) {
			for (int j = 0; j < heldArray[i].length; j++) {
				sum += heldArray[i][j];
			}
			retArray[i] = sum;
			sum = 0.0;
		}
		
		return retArray;
	}

	public double[] sumCols() {
		double[] retArray = new double[1];
		retArray[0] = 0.0;
		
		return retArray;
	}

	

}
