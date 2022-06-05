/*
 * Version kobayashi 2010/11/12

public class HelloWorld3 {
	public static void main(final String[] koba) {
    	int i = 0;
		String keisuke;
		for (; i<koba.length; ++i) {
			System.out.println(koba[i]);
			keisuke=sub(koba[i]);
			System.out.println(keisuke);
       }
   }
   public static String sub(String yashi) {
       yashi = yashi + "!";
       System.out.println(yashi);
       yashi = yashi + "!";
       return yashi;
   }
}

 */

public class HelloWorld3 {

	public static void main(final String[] koba) {

		String keisuke;


		// 引数の数と引数の値を表示する
		System.out.println("koba.length = " + koba.length);
		System.out.println("koba[0]     = " + koba[0]);
		System.out.println("koba[1]     = " + koba[1]);
//		System.out.println("koba[2]     = " + koba[2]);　　//エラー。引数の数が範囲外だよ、と例外になる。


		for (int i=0; i<koba.length; i++) {
			System.out.println(koba[i]);
			keisuke=sub(koba[i]);          // sub() の実行
			System.out.println(keisuke);
		}
	}

	public static String sub(String yashi) {
		yashi = yashi + "!";
		System.out.println(yashi);
		yashi = yashi + "!";
		return yashi;
	}
}

