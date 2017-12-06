/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig2_1;

public class assig2_1 {
	public static void main(String[] args) throws InterruptedException {
		// for (int x = 0; x < 10000000; x++) {
		Matrix one = new Matrix(3, 100);
		one.fill();
		one.calc();
		//int linear = one.getMatSum();
		System.out.println("Serial:" + one.getMatSum());
		one.clearSum();

		Thread a = new Thread(new MatrixCounter(0, one));
		Thread b = new Thread(new MatrixCounter(1, one));
		Thread c = new Thread(new MatrixCounter(2, one));

		a.start();
		b.start();
		c.start();

		a.join(); // ווידוא שהתהליכונים סיימו לרוץ. זריקת חריגה בשורת המיין
		b.join();
		c.join();

		System.out.println("parallel: " + one.getMatSum());

		/*
		 * if (linear != one.getMatSum()) System.out.println(x + ": Linear: " +
		 * linear + " Mak: " + one.getMatSum());
		 */

		// }
	}
}
