package calculator.methods.solution;

public class Methods {
	double sum = 0;
	public double add(double[] h, int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum + h[i];
		}
		System.out.println("Sum= " + sum);
		return sum;
	}

	public double substract(double[] h, int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum - h[i];
		}
		System.out.println(sum);
		return sum;
	}

	public double multiply(double h[], int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum * h[i];
		}
		System.out.println(sum);
		return sum;
	}

	public double divide(double h[], int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum / h[i];
		}
		System.out.println(sum);
		return sum;
	}
}
