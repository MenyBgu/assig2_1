/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig2_1;

public class Matrix {
	private int rows;
	private int cols;
	private int matrixSum;
	private int[][] matrix;

	Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		matrix = new int[rows][cols];
		matrixSum = 0;
	}

	public void fill() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = 1;
			}
		}
	}

	public void calc() {
		matrixSum = rows * cols;
	}

	/*
	 * public void setMatSum(int i) { matrixSum += i; } //לפני התיקון
	 */

	public synchronized void setMatSum(int i) { // אחרי התיקון
		matrixSum += i;
	}

	public void clearSum() {
		matrixSum = 0;
	}

	public int getCols() {
		return cols;
	}

	public int getMatValue(int row, int i) {
		return matrix[row][i];
	}

	public int getMatSum() {
		return matrixSum;
	}
}
