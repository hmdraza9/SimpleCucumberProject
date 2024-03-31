package test.util.pack;

public class Utils {

	public static int i = 0;

	public static String nanoTime() {
		return String.valueOf(System.nanoTime()) + "_" + String.valueOf(i++);

	}

}
