/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig2_1;

public class MatrixCounter implements Runnable {
	private int row;
	private Matrix matrix;

	MatrixCounter(int row, Matrix matrix) {
		this.row = row;
		this.matrix = matrix;
	}

	public void run() {
		for(int i=0;i<matrix.getCols();i++){
			matrix.setMatSum(matrix.getMatValue(row, i));
		}
	}

}
